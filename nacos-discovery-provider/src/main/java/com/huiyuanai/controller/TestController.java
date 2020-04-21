package com.huiyuanai.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: xue rui quan
 * @create: 2020-04-20 09:31
 */
@RestController
public class TestController {
    @Value("${server.port}")
    private Integer port;
    @GetMapping(value = "/hello")
    public String hello(@RequestParam String name){
        return "hello " + name + "  port:" + port;
    }
}
