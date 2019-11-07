package com.ljy.qx.xns.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author : 夕
 * @date : 2019/10/21
 */

@Controller
public class Test {

    @GetMapping("/test")
    public String getIndex(){
        return "index";
    }
}
