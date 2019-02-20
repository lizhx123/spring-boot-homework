package com.homework.springboothomework.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class IndexController {

    @GetMapping("/")
    public  String index(){
        log.info("--------------------------启动成功--------------------");
        return "index";
    }
}
