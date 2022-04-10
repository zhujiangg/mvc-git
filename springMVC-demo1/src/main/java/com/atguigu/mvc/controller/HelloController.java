package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping(value = "/")
    public String index() {
        //设置视图名称
        return "index";
    }

    @RequestMapping(value = "/target")
    public String toTarget(){
        return "target";
    }
}
