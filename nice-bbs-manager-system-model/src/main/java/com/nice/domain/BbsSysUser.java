package com.nice.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * bbs后台管理系统用户类
 * @author ningh
 */
@Data
public class BbsSysUser implements Serializable {

    /**
     * bbs系统用户id
     */
    private Long bbsSysUserId;

    /**
     * bbs系统用户名
     */
    private String bbsSysUserName;

    /**
     * bbs系统用户创建时间
     */
    private Date bbsSysUserCreateDate;

    /**
     * bbs系统用户更新时间
     */
    private Date bbsSysUserModifyDate;

    /**
     * 盐值
     */
    private String salt;




}
