package com.wly.common.util;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.*;

import javax.xml.parsers.ParserConfigurationException;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.StringUtils;
import org.xml.sax.SAXException;

/**
 * User: rizenguo
 * Date: 2014/10/29
 * Time: 15:23
 */
public class SignUtil {
	
	public static Map<String,Object> createSignMap(String source){
		Map<String,Object> map = new TreeMap<>();
		String nonce = RandomStringUtils.random(10, "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890");
		
		map.put("source", source);
		map.put("timestamp", (int)(System.currentTimeMillis()/1000));
		map.put("nonce", nonce);
		
		return map;
	}

    public static JSONObject createSignJson(String source){
        JSONObject jsonObject=new JSONObject();
        String nonce = RandomStringUtils.random(10, "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890");
        jsonObject.put("source", source);
        jsonObject.put("timestamp", (int)(System.currentTimeMillis()/1000));
        jsonObject.put("nonce", nonce);
        return jsonObject;
    }
	
	/** 
	 * 将map转换成url 
	 * @param map 
	 * @return 
	 */  
	public static String getUrlParamsByMap(Map<String, Object> map) {  
	    if (map == null) {  
	        return "";  
	    }  
	    StringBuffer sb = new StringBuffer();  
	    for (Map.Entry<String, Object> entry : map.entrySet()) {  
	        sb.append(entry.getKey() + "=" + entry.getValue());  
	        sb.append("&");  
	    }  
	    String s = sb.toString();  
	    if (s.endsWith("&")) {  
	        s = org.apache.commons.lang.StringUtils.substringBeforeLast(s, "&");
	    }  
	    return s;  
	}
	
	
	/** 
	 * 将url参数转换成map 
	 * @param param aa=11&bb=22&cc=33 
	 * @return 
	 */  
	public static Map<String, Object> getUrlParams(String param) {  
	    Map<String, Object> map = new HashMap<String, Object>(0);  
	    if (StringUtils.isBlank(param)) {
	        return map;  
	    }  
	    String[] params = param.split("&");  
	    for (int i = 0; i < params.length; i++) {  
	        String[] p = params[i].split("=");  
	        if (p.length == 2) {  
	            map.put(p[0], p[1]);  
	        }  
	    }  
	    return map;  
	} 
    /**
     * 签名算法
     * @param o 要参与签名的数据对象
     * @return 签名
     * @throws IllegalAccessException
     */
    public static String getSign(Object o,String key) throws IllegalAccessException {
        ArrayList<String> list = new ArrayList<String>();
        Class cls = o.getClass();
        Field[] fields = cls.getDeclaredFields();
        for (Field f : fields) {
            f.setAccessible(true);
            if (f.get(o) != null && f.get(o) != "") {
                list.add(f.getName() + "=" + f.get(o) + "&");
            }
        }
        int size = list.size();
        String [] arrayToSort = list.toArray(new String[size]);
        Arrays.sort(arrayToSort, String.CASE_INSENSITIVE_ORDER);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < size; i ++) {
            sb.append(arrayToSort[i]);
        }
        String result = sb.toString();
        result += "key=" + key;
        Util.log("Sign Before MD5:" + result);
        result = MD5Util.MD5Encode(result).toUpperCase();
        Util.log("Sign Result:" + result);
        return result;
    }

    public static String getSign(Map<String,Object> map,String key){
        ArrayList<String> list = new ArrayList<String>();
        for(Map.Entry<String,Object> entry:map.entrySet()){
            if(entry.getValue()!=""){
                list.add(entry.getKey() + "=" + entry.getValue() + "&");
            }
        }
        int size = list.size();
        String [] arrayToSort = list.toArray(new String[size]);
        Arrays.sort(arrayToSort, String.CASE_INSENSITIVE_ORDER);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < size; i ++) {
            sb.append(arrayToSort[i]);
        }
        String result = sb.toString();
        result += "key=" + key;
        Util.log("Sign Before MD5:" + result);
        result = MD5Util.MD5Encode(result).toUpperCase();
        Util.log("Sign Result:" + result);
        return result;
    }
}
