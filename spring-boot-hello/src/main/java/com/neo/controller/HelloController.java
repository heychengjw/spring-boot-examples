package com.neo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${com.zzq.name}")
    private  String name;

    @Value("${com.zzq.title}")
    private  String title;

    @RequestMapping("/hello")
    public String hello(){
        return title + "：" + name;
    }

    @RequestMapping("/")
    public String index() {
        return "Hello Spring Boot 2.0!";
    }
}