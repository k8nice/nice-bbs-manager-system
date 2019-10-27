package com.nice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 主页面相关控制类
 * @author ningh
 */
@Controller
@RequestMapping
public class MainController {

    /**
     * 访问主页面
     * @return html/main  主页面模板路径
     */
    @GetMapping("/main")
    public String mainPage(){
        return "html/main";

    }

}
