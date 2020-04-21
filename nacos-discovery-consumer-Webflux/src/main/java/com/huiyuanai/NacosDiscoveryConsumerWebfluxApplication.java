package com.huiyuanai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @description:
 * @author: xue rui quan
 * @create: 2020-04-21 15:14
 */
@EnableDiscoveryClient
@SpringBootApplication
public class NacosDiscoveryConsumerWebfluxApplication {
    public static void main(String[] args) {
        SpringApplication.run(NacosDiscoveryConsumerWebfluxApplication.class, args);
        System.out.println("NacosDiscoveryConsumerWebfluxApplication 启动成功，:.ﾟヽ(｡◕‿◕｡)ﾉﾟ.:｡+ﾟ");
    }
}
