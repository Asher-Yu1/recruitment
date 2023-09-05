package com.example.sacc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.example.sacc.mapper")
@SpringBootApplication
public class SaccApplication {

    public static void main(String[] args) {
        SpringApplication.run(SaccApplication.class, args);
    }

}
