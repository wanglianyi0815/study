package com.wly.common.util;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.EnvironmentStringPBEConfig;

/**
 * 测试加解密.
 * Created by wanglianyi on 2017/4/14 0014.
 */
public class TestJasypt {
    public static void main(String[] args) {
        //加密工具
        StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();


        //加密配置
        EnvironmentStringPBEConfig config = new EnvironmentStringPBEConfig();
        config.setAlgorithm("PBEWithMD5AndDES");
        //自己在用的时候更改此密码
        config.setPassword("caixinpay");
        //应用配置
        encryptor.setConfig(config);
        String ciphertext = encryptor.encrypt("111");


        ciphertext="FksktoFMjF+2RQ8tYbu5oKZtkgiRoc2W";

        System.out.println(ciphertext);
        //解密
        String plaintext = encryptor.decrypt(ciphertext);
        System.out.println(ciphertext + " : " + plaintext);
    }
}
