package com.huiyuanai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @description:
 * @author: xue rui quan
 * @create: 2020-04-20 09:33
 */
@EnableDiscoveryClient
@SpringBootApplication
public class NacosDiscoveryConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(NacosDiscoveryConsumerApplication.class, args);
        System.out.println("NacosDiscoveryConsumerApplication 启动成功，:.ﾟヽ(｡◕‿◕｡)ﾉﾟ.:｡+ﾟ");
    }
}
