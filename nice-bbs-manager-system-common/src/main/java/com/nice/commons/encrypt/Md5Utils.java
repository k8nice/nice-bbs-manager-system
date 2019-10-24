package com.nice.commons.encrypt;

import org.apache.shiro.crypto.hash.SimpleHash;

/**
 * md5工具类
 * @author ningh
 */
public class Md5Utils {

    /**
     * 通过盐值和未加密的密码来加密
     * @param password 密码
     * @param salt 盐值
     * @return password  已加密的密码
     */
    public static String getMd5Password(String password,String salt){
        String hashAlgorithmName="md5";
        int hash = 1024;
        return new SimpleHash(hashAlgorithmName,password,salt,hash).toString();
    }

    /**
     * 主函数测试
     * @param args 参数
     */
    public static void main(String[] args) {
        System.out.println(getMd5Password("nice","nice"));
    }


}
