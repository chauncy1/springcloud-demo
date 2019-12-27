package com.man;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer9103Application {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer9103Application.class, args);
    }
}
