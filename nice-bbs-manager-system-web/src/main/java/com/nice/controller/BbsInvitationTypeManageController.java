package com.nice.controller;

import com.nice.domain.BbsInvitationType;
import com.nice.domain.BbsSysUser;
import com.nice.service.BbsInvitationTypeManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * bbs帖子类别管理控制类
 * @author ningh
 */
@Controller
@RequestMapping("/bbs/invitation/type")
public class BbsInvitationTypeManageController {

    /**
     * 注入服务
     */
    @Autowired
    private BbsInvitationTypeManageService bbsInvitationTypeManageService;

    /**
     * 创建帖子类型
     * @param bbsInvitationType bbs帖子类型
     * @param request   请求
     * @return
     */
    @PostMapping("/create/{bbsInvitationType}")
    public String createBbsInvitationType(@PathVariable BbsInvitationType bbsInvitationType, HttpServletRequest request){
        BbsSysUser bbsSysUser = (BbsSysUser) request.getSession().getAttribute("USER");
        return null;
    }


}
