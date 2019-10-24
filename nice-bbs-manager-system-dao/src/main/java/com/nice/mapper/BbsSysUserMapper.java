package com.nice.mapper;

import com.nice.domain.BbsSysUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author ningh
 */
@Mapper
public interface BbsSysUserMapper {

    /**
     * 根据用户名获取密码和盐值
     * @param bbsUserName
     * @return
     */
    BbsSysUser queryBbsSysUserPasswordAndSaltByBbsSysUserName(@Param("bbsSysUserName")String bbsUserName);

    /**
     * 根据bbs系统用户名或者bbs的系统用户id
     * @param bbsSysUserName bbs系统用户名
     * @return bbsSysUserId  bbs系统用户id
     */
    Long queryBbsSysUserIdByBbsSysUserName(String bbsSysUserName);

}
