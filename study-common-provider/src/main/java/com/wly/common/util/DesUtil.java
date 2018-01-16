package com.wly.common.util;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import java.net.URLDecoder;
import java.security.SecureRandom;

/**
 * Created by wanglianyi on 2017/11/28 0028.
 */
public class DesUtil {
    public static String encrypt(String srcStr, String password) {
        byte[] datasource=srcStr.getBytes();
        try {
            SecureRandom random = SecureRandom.getInstance("SHA1PRNG");
            random.setSeed(password.getBytes());
            DESKeySpec desKey = new DESKeySpec(password.getBytes());
            //创建一个密匙工厂，然后用它把DESKeySpec转换成
            SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
            SecretKey securekey = keyFactory.generateSecret(desKey);
            //Cipher对象实际完成加密操作
            Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
            //用密匙初始化Cipher对象
            cipher.init(Cipher.ENCRYPT_MODE, securekey, random);
            //现在，获取数据并加密
            //正式执行加密操作
            byte[] result= cipher.doFinal(datasource);
            return Base64Util.encode(result);
        } catch (Throwable e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String decrypt(String encStr, String password) {
        byte[] src=Base64Util.decode(encStr);
        try{
            // DES算法要求有一个可信任的随机数源
            SecureRandom random = SecureRandom.getInstance("SHA1PRNG");
            random.setSeed(password.getBytes());
            // 创建一个DESKeySpec对象
            DESKeySpec desKey = new DESKeySpec(password.getBytes());
            // 创建一个密匙工厂
            SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
            // 将DESKeySpec对象转换成SecretKey对象
            SecretKey securekey = keyFactory.generateSecret(desKey);
            // Cipher对象实际完成解密操作
            Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
            // 用密匙初始化Cipher对象
            cipher.init(Cipher.DECRYPT_MODE, securekey, random);
            // 真正开始解密操作
            return new String(cipher.doFinal(src));
        } catch (Throwable e) {
            e.printStackTrace();
            return null;
        }

    }

    public static void main(String[] args) throws Exception{
        System.out.println(decrypt("vcSfMRzvBVa3xVsb4VcyXPooW9avZWStPPB0LnbUo+w5en9fVXKyXAx6JMD/NEUf90N+k9qVi27QYW9f+k+MQt5yLY4UNj5ij/WqBzsn1HUi0Iop4fMUbFNZ7xPxwNvXHhGxlajWcTLQNbt8VoCVF2N95iNOJX3jYlxa6NUseU72OfFexoL5a6Db1SG5y1QuglTIWDU6AYkMbJ4HlH1NGjPkASzX2ABFsKFWMFRPlkJijdFw8h4GvIMPO560Ib2KH","caxin@123"));
    }
}
