package com.nice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 欢迎页面的Controller层
 * @author ningh
 */
@Controller
@RequestMapping("/")
public class IndexController {

    /**
     * 欢迎页面
     * @return "html/index' html文件夹下的index.html页面
     */
    @GetMapping
    public String  indexPage(){
        return "html/index";
    }

}
