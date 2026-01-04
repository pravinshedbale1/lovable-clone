package com.javacommune.lovablebackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
public class LovableBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(LovableBackendApplication.class, args);
    }

}
