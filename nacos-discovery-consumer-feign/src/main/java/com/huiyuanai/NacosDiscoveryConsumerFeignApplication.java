package com.huiyuanai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @description:
 * @author: xue rui quan
 * @create: 2020-04-21 14:51
 */
@EnableFeignClients // 注解开启扫描spring cloud feign客户端的功能
@EnableDiscoveryClient
@SpringBootApplication
public class NacosDiscoveryConsumerFeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(NacosDiscoveryConsumerFeignApplication.class, args);
        System.out.println("NacosDiscoveryConsumerFeignApplication 启动成功，:.ﾟヽ(｡◕‿◕｡)ﾉﾟ.:｡+ﾟ");
    }
}
