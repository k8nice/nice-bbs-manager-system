package com.nice.service;

/**
 * 登录接口类
 * @author ningh
 */
public interface LoginService {

    /**
     * 登录用户
     * @return true or false
     */
    boolean loginUser(String bbsSysUserName,String bbsSysUserPassword);

}
