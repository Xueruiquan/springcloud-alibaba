package com.huiyuanai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @description:
 * @author: xue rui quan
 * @create: 2020-04-20 10:14
 */
@EnableDiscoveryClient
@SpringBootApplication
public class NacosDiscoveryClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(NacosDiscoveryClientApplication.class, args);
        System.out.println("NacosDiscoveryClientApplication 启动成功，:.ﾟヽ(｡◕‿◕｡)ﾉﾟ.:｡+ﾟ");
    }
}
