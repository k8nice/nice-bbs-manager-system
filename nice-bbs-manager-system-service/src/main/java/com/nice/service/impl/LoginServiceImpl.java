package com.nice.service.impl;

import com.nice.commons.encrypt.Md5Utils;
import com.nice.domain.BbsSysUser;
import com.nice.mapper.BbsSysUserMapper;
import com.nice.service.LoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *登录服务实现类
 * @author ningh
 */
@Service
public class LoginServiceImpl implements LoginService {

    /**
     * 注入bbs管理员用户mapper
     */
    @Autowired
    private BbsSysUserMapper bbsSysUserMapper;

    private static final Logger LOGGER = LoggerFactory.getLogger(LoginServiceImpl.class);


    /**
     * 判断用户登录是否成功
     * @param bbsSysUserName 用户名
     * @param bbsSysUserPassword 密码
     * @return true or false
     */
    @Override
    public boolean loginUser(String bbsSysUserName,String bbsSysUserPassword) {
        //从数据库中取出盐值和密码
        BbsSysUser bbsSysUser = bbsSysUserMapper.queryBbsSysUserPasswordAndSaltByBbsSysUserName(bbsSysUserName);
        //如果返回的对象为null,则返回false
        if (bbsSysUser == null){
            return false;
        }
        bbsSysUserPassword = Md5Utils.getMd5Password(bbsSysUserPassword, bbsSysUser.getSalt());
        //通过接口获得的密码生成加密后的密码进行对称加密
        //加密后的密码对比数据库中取出的密码
        if (bbsSysUserPassword.equals(bbsSysUser.getBbsSysUserPassword())){
            return  true;
        }
        return false;
    }
}
