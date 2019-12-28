package com.man;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class GitConfig9301Application {
    public static void main(String[] args) {
        SpringApplication.run(GitConfig9301Application.class, args);
    }
}
