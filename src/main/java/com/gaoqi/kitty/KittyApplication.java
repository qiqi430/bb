package com.gaoqi.kitty;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@EnableTransactionManagement
@SpringBootApplication()
@MapperScan(basePackages = "com.gaoqi.kitty.mapper")
public class KittyApplication {

    public static void main(String[] args) {
        SpringApplication.run(KittyApplication.class, args);
    }

}

