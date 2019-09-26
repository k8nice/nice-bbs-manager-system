package com.nice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ningh
 */
@Controller
@RequestMapping("/")
public class IndexController {

    @GetMapping
    public String  indexPage(){
        return "html/index";
    }

}
