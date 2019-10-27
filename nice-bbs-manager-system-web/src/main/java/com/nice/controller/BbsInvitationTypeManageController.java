package com.nice.controller;

import com.nice.domain.BbsInvitationType;
import com.nice.domain.BbsSysUser;
import com.nice.service.BbsInvitationTypeManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping("/create")
    public String createBbsInvitationType(BbsInvitationType bbsInvitationType, HttpServletRequest request){
//        System.out.println(1);
        BbsSysUser bbsSysUser = (BbsSysUser) request.getSession().getAttribute("USER");
        bbsInvitationType.setBbsUserId(bbsSysUser.getBbsSysUserId());
        if (bbsInvitationTypeManageService.createBbsInvitationType(bbsInvitationType)){
            return "redirect:/main";
        }
        else {
            return "redirect:./";
        }
    }


}
