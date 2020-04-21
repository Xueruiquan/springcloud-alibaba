package com.huiyuanai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @description:
 * @author: xue rui quan
 * @create: 2020-04-21 15:32
 */
@EnableDiscoveryClient
@SpringBootApplication
public class NacosDiscoveryGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(NacosDiscoveryGatewayApplication.class, args);
        System.out.println("NacosDiscoveryGatewayApplication 启动成功，:.ﾟヽ(｡◕‿◕｡)ﾉﾟ.:｡+ﾟ");
    }
}
