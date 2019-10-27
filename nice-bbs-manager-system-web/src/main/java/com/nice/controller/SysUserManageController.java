package com.nice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 系统用户管理控制类
 * @author ningh
 */
@Controller
@RequestMapping("/sys/user")
public class SysUserManageController {

    /**
     * 默认查询第一页，每页用户为10个
     * @return redirect:/find/page/1  转发到findSysUserByPageNum接口
     */
    @GetMapping("/find/page/default")
    public String defaultFindSysUser(){
        return "redirect:/find/page/1";
    }

    /**
     * 根据页码查询用户列表
     * @param pageNum   页码
     * @return
     */
    @GetMapping("/find/page/{pageNum}")
    public String findSysUserByPageNum(@PathVariable Long pageNum){
        return null;
    }

}
