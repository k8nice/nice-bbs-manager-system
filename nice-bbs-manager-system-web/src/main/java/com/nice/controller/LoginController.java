package com.nice.controller;

import com.nice.domain.BbsSysUser;
import com.nice.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @author ningh
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    /**
     * 登录页面
     * @return
     */
    @GetMapping("/index")
    public String loginIndex(){
        return "html/login";
    }

    /**
     * 判断用户名密码是否正确
     * @return
     */
    @PostMapping("/sys/user/check")
//    @ResponseBody
    public String checkSysUserIsReally(@RequestParam("username")String bbsUserName, @RequestParam("password") String bbsUserPassword, HttpServletRequest request){
        if (loginService.loginUser(bbsUserName,bbsUserPassword)){
            BbsSysUser bbsSysUser = new BbsSysUser();
            bbsSysUser.setBbsSysUserName(bbsUserName);
            request.getSession().setAttribute("USER",bbsSysUser);
            return "html/main";
        }
        return "html/login";
//        return null;
    }




}
