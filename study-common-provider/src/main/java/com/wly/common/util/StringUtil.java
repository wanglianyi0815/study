package com.wly.common.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 *
 * Created by wanglianyi on 2017/8/23 0023.
 */
public class StringUtil {
    public static String replaceBlank(String str) {
        String dest = "";
        if (str!=null) {
            Pattern p = Pattern.compile("\\s*|\t|\r|\n");
            Matcher m = p.matcher(str);
            dest = m.replaceAll("");
        }
        return dest;
    }
}
