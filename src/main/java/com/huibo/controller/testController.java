package com.huibo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

    @RequestMapping(value = "/test")
    public String test(){
        System.out.println("-------------------------------------------------");
        return "--------------";
    }
}
