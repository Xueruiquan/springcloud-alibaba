package com.huiyuanai.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: xue rui quan
 * @create: 2020-04-20 10:19
 */
@RefreshScope
@RestController
public class TestController {
    @Value("${test}")
    private String strTest;
    @GetMapping("/test")
    public String test(){
        return strTest;
    }
}
