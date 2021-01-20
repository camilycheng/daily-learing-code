package com.cly.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName: OrderMain80
 * @Version: 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderMain80 {

    public static void main(String[] args) {

        SpringApplication.run(OrderMain80.class, args);
    }
}
