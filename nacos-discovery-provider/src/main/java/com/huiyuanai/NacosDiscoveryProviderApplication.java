package com.huiyuanai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @description:
 * @author: xue rui quan
 * @create: 2020-04-20 09:02
 */
// @EnableDiscoveryClient开启Spring Cloud的服务注册与发现，
// 由于这里引入了spring-cloud-starter-alibaba-nacos-discovery模块，
// 所以Spring Cloud Common中定义的那些/与服务治理相关的接口将使用Nacos的实现
@EnableDiscoveryClient
@SpringBootApplication
public class NacosDiscoveryProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(NacosDiscoveryProviderApplication.class, args);
        System.out.println("NacosDiscoveryProviderApplication 启动成功，:.ﾟヽ(｡◕‿◕｡)ﾉﾟ.:｡+ﾟ");
    }
}
