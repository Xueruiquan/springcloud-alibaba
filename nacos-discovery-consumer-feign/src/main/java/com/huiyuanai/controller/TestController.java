package com.huiyuanai.controller;

import com.huiyuanai.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: xue rui quan
 * @create: 2020-04-21 14:57
 */
@RestController
public class TestController {
    @Autowired
    private TestService testService;

    @GetMapping(value = "/test")
    public String test() {
        String result = testService.hello("zhangsan");
        return "NacosDiscoveryConsumerFeignApplication："+ result +" (¬､¬) (￢_￢)";
    }
}
