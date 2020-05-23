package com.liangliang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * created by Liangliang on 2020/5/24
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Order82 {
    public static void main(String[] args) {
        SpringApplication.run(Order82.class, args);
    }
}
