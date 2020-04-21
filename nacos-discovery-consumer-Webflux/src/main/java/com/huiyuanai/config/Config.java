package com.huiyuanai.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * @description:
 * @author: xue rui quan
 * @create: 2020-04-21 15:23
 */
@Configuration
public class Config {
    @Bean
    @LoadBalanced
    public WebClient.Builder loadBalancedWebClientBuilder(){
        return WebClient.builder();
    }
}
