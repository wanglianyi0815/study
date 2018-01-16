package com.wly.common.util;


import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.XmlFriendlyNameCoder;
import org.apache.log4j.Logger;

import javax.servlet.http.HttpServletRequest;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.net.URLEncoder;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public class Util {

    //打log用
    private static Logger logger = Logger.getLogger(Util.class);

    /**
     * 通过反射的方式遍历对象的属性和属性值，方便调试
     *
     * @param o 要遍历的对象
     * @throws Exception
     */
    public static void reflect(Object o) throws Exception {
        Class cls = o.getClass();
        Field[] fields = cls.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            Field f = fields[i];
            f.setAccessible(true);
            Util.log(f.getName() + " -> " + f.get(o));
        }
    }

    public static byte[] readInput(InputStream in) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int len = 0;
        byte[] buffer = new byte[1024];
        while ((len = in.read(buffer)) > 0) {
            out.write(buffer, 0, len);
        }
        out.close();
        in.close();
        return out.toByteArray();
    }

    public static String inputStreamToString(InputStream is) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int i;
        while ((i = is.read()) != -1) {
            baos.write(i);
        }
        return baos.toString();
    }


    public static InputStream getStringStream(String sInputString) {
        ByteArrayInputStream tInputStringStream = null;
        if (sInputString != null && !sInputString.trim().equals("")) {
            tInputStringStream = new ByteArrayInputStream(sInputString.getBytes());
        }
        return tInputStringStream;
    }

    public static Object getObjectFromXML(String xml, Class tClass) {
        //将从API返回的XML数据映射到Java对象
        XStream xStreamForResponseData = new XStream();
        xStreamForResponseData.alias("xml", tClass);
        xStreamForResponseData.ignoreUnknownElements();//暂时忽略掉一些新增的字段
        return xStreamForResponseData.fromXML(xml);
    }

    public static String getStringFromMap(Map<String, Object> map, String key, String defaultValue) {
        if (key == "" || key == null) {
            return defaultValue;
        }
        String result = (String) map.get(key);
        if (result == null) {
            return defaultValue;
        } else {
            return result;
        }
    }

    public static int getIntFromMap(Map<String, Object> map, String key) {
        if (key == "" || key == null) {
            return 0;
        }
        if (map.get(key) == null) {
            return 0;
        }
        return Integer.parseInt((String) map.get(key));
    }

    /**
     * 打log接口
     * @param log 要打印的log字符串
     * @return 返回log
     */
    public static String log(Object log){
        logger.info(log.toString());
        System.out.println(log);
        return log.toString();
    }

    /**
     * 读取本地的xml数据，一般用来自测用
     * @param localPath 本地xml文件路径
     * @return 读到的xml字符串
     */
    public static String getLocalXMLString(String localPath) throws IOException {
        return Util.inputStreamToString(Util.class.getResourceAsStream(localPath));
    }

    /**
     * 获取一定长度的随机字符串
     * @param length 指定字符串长度
     * @return 一定长度的字符串
     */
    public static String getRandomStringByLength(int length) {
        String base = "abcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(base.length());
            sb.append(base.charAt(number));
        }
        return sb.toString();
    }
    
    public static String ObjectToXml(Object xmlObj){
    	 //解决XStream对出现双下划线的bug
        XStream xStreamForRequestPostData = new XStream(new DomDriver("UTF-8", new XmlFriendlyNameCoder("-_", "_")));

        //将要提交给API的数据对象转换成XML格式数据Post给API
        return xStreamForRequestPostData.toXML(xmlObj);
    }
    
    public static String IntTo0String(int num){
    	String str = String.valueOf(num);
    	if(num<0){
    		str = "00000";
    	}else if(num<10){
    		str = "0000"+str;
    	}else if(num<100){
    		str = "000"+str;
    	}else if(num<1000){
    		str = "00"+str;
    	}else if(num<10000){
    		str = "0"+str;
    	}else{
    		str = str.substring(0,5);
    	}
    	return str;
    }
    
    /**
     * 创建内部订单编号
     * @param prefix 前缀
     * @return 订单编号
     */
    public static String makeTradeNo(String prefix){
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		long now = System.currentTimeMillis();
		String timestart = sdf.format(new Date(now));
		return prefix + timestart + Util.IntTo0String((int) (1 + Math.random() * (100000 - 1 + 1)));
    }
    
    public static Map getParameterMap(HttpServletRequest request) {
    	// 参数Map
    	Map properties = request.getParameterMap();
    	// 返回值Map
    	Map returnMap = new HashMap();
    	Iterator entries = properties.entrySet().iterator();
    	Map.Entry entry;
    	String name = "";
    	String value = "";
    	while (entries.hasNext()) {
    		entry = (Map.Entry) entries.next();
    		name = (String) entry.getKey();
    		Object valueObj = entry.getValue();
    		if(null == valueObj){
    			value = "";
    		}else if(valueObj instanceof String[]){
    			String[] values = (String[])valueObj;
    			for(int i=0;i<values.length;i++){
    				value = values[i] + ",";
    			}
    			value = value.substring(0, value.length()-1);
    		}else{
    			value = valueObj.toString();
    		}
    		returnMap.put(name, value);
    	}
    	return returnMap;
    }
    
    /**
     * 长地址转短地址
     * @param longUrl 长地址
     * @return
     */
    public static String getShortUrl(String longUrl){
    	try {
			String reqUrl = "http://a.caixin.com/getShortUrl?url=" + URLEncoder.encode(longUrl,"UTF-8");
            return TestGetPost.sendGet(reqUrl,"");
        } catch (Exception e) {
			e.printStackTrace();
		}
    	return longUrl;
    }
    
    
    /**
     * 判断浏览器是否手机
     * @param userAgent 浏览器UA
     * @return 是否手机
     */
    public static boolean isMobile(String userAgent){
    	boolean isMoblie = false;
        String[] mobileAgents = { "iphone", "android", "phone", "mobile", "wap", "blackberry"};
        for (String mobileAgent : mobileAgents) {
	        if (userAgent.toLowerCase().indexOf(mobileAgent) >= 0) {
	        	logger.info("Request UA:" + userAgent + " (Match:" + mobileAgent + ") IS MOBILE!!!");
	            isMoblie = true;
	            break;
	        }
        }
        return isMoblie;
    }
    
}

