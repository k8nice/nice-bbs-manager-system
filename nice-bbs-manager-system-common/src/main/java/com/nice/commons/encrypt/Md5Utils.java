package com.nice.commons.encrypt;

import org.apache.shiro.crypto.hash.SimpleHash;

/**
 * md5工具类
 * @author ningh
 */
public class Md5Utils {

    public static String getMd5Password(String password,String salt){
        String hashAlgorithmName="md5";
        int hash = 1024;
        return new SimpleHash(hashAlgorithmName,password,salt,hash).toString();
    }

    public static void main(String[] args) {
        System.out.println(getMd5Password("nice","nice"));
    }


}
