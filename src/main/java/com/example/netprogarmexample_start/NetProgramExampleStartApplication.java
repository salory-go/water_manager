package com.example.netprogarmexample_start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
@EnableTransactionManagement
public class NetProgramExampleStartApplication {
    public static void main(String[] args) {
        SpringApplication.run(NetProgramExampleStartApplication.class, args);
    }
}
