package com.wly.common.util;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author zhuzhisheng@jiedaibao.com
 * @Description
 * @date on 2015/11/17.
 */
public class MapUtil {

    /**
     * 使用 Map按key进行排序
     * @param map
     * @return
     */
    public static String sortStringByKey(Map<String, Object> map,String charActer) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        Map<String, Object> sortMap = new TreeMap<>(new Comparator<String>(){

            @Override
            public int compare(String str1, String str2) {

                return str1.compareTo(str2);
            }
        });
        sortMap.putAll(map);

        StringBuffer sb = new StringBuffer();
        for(Map.Entry<String,Object> entry : sortMap.entrySet()){
            sb.append(entry.getKey());
            sb.append("=");
            sb.append(entry.getValue());
            sb.append(charActer);
        }
        return sb.substring(0, sb.length() - 1);
    }

    /**
     * 移除值为空的数据项
     * @param map
     * @return
     */
    public static Map<String,Object> removeNull(Map<String,Object> map){

        Map<String,Object> resultMap = new HashMap<>();

        for(Map.Entry<String,Object> entry : map.entrySet()){
            if(entry.getValue() != null && !"".equals(entry.getValue())){
                resultMap.put(entry.getKey(), entry.getValue());
            }
        }
        return resultMap;
    }


}
