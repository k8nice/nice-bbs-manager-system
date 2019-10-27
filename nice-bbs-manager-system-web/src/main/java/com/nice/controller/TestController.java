package com.nice.controller;
import	java.awt.Container;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ningh
 */
@RequestMapping
@Controller
public class TestController {

    @GetMapping("/test/test1")
    public String test(){
        return "redirect:/";
    }
}
