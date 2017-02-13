package com.ff.modeal.util;

import java.security.MessageDigest;

public class Encryption {                       // 암호화하는 클래스(SHA(Secure Hash Algorithm, 안전한 해시 알고리즘)256)
    public static String Sha256(String base) {  // base : 암호화해야하는 문자열
        StringBuffer hexString = new StringBuffer();

        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(base.getBytes("UTF-8"));

            for (int i = 0; i < hash.length; i++) {
                String hex = Integer.toHexString(0xff & hash[i]);
                if(hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }

            // 출력
//            System.out.println(hexString.toString());
        } catch(Exception ex){
            throw new RuntimeException(ex);
        }

        return hexString.toString();            // base를 암호화한 값 출력
    }
}
