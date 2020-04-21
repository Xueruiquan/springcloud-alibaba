package com.huiyuanai.controller;

import com.alibaba.cloud.nacos.ribbon.NacosServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.cloud.netflix.ribbon.RibbonLoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

/**
 * @description:
 * @author: xue rui quan
 * @create: 2020-04-20 09:40
 */
@RestController
public class TestController {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping(value = "/test")
    public String test(){
        /*ServiceInstance serviceInstance = loadBalancerClient.choose("nacos-discovery-provider");
        URI uri = serviceInstance.getUri();
        String forObject = restTemplate.getForObject(uri + "/hello?name=123", String.class);*/

        //通过服务名直接访问，需要RestTemplate支持@LoadBalanced
//        String forObject = restTemplate.getForObject("http://nacos-discovery-provider/hello?name=123", String.class);

        //获取元信息---》此方式需去掉RestTemplate上的@LoadBalanced注解
        RibbonLoadBalancerClient.RibbonServer ribbonServer = (RibbonLoadBalancerClient.RibbonServer) loadBalancerClient.choose("nacos-discovery-provider");
        NacosServer nacosServer = (NacosServer) ribbonServer.getServer();
        Map<String, String> metadata = nacosServer.getMetadata();
        System.out.println("元数据------>" + metadata);
        String forObject = restTemplate.getForObject(ribbonServer.getUri() + "/hello?name=123", String.class);
        return forObject;
    }
}
