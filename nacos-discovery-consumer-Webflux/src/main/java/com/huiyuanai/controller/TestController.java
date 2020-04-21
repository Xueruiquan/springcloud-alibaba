package com.huiyuanai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

/**
 * @description:
 * @author: xue rui quan
 * @create: 2020-04-21 15:16
 */
@RestController
public class TestController {
    @Autowired
    private WebClient.Builder webClientBuilder;

    @GetMapping(value = "/test")
    public Mono<String> test(){
        Mono<String> result = webClientBuilder.build()
                .get()
                .uri("http://nacos-discovery-provider/hello?name=zhangsan")
                .retrieve()
                .bodyToMono(String.class);
        return result;
    }
}
