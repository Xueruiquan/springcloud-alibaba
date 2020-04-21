package com.huiyuanai.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @description:
 * @author: xue rui quan
 * @create: 2020-04-21 15:02
 */
@FeignClient("nacos-discovery-provider")  // 指定这个接口所调用的服务的名称
public interface TestService {
    @GetMapping("/hello")
    String hello(@RequestParam(name = "name") String name);
}
