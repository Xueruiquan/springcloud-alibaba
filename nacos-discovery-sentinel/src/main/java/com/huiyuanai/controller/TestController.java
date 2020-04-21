package com.huiyuanai.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: xue rui quan
 * @create: 2020-04-21 16:25
 */
@RestController
public class TestController {
    @GetMapping("/hello")
    public String hello() {
        return "sherry";
    }
}
