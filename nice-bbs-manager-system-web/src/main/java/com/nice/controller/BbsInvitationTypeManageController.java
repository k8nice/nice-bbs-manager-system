package com.nice.controller;

import com.nice.domain.BbsInvitationType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * bbs帖子类别管理控制类
 * @author ningh
 */
@Controller
@RequestMapping("/bbs/invitation/type")
public class BbsInvitationTypeManageController {

    @GetMapping("/create/{bbsInvitationType}")
    public String createBbsInvitationType(@PathVariable BbsInvitationType bbsInvitationType){

        return null;
    }


}
