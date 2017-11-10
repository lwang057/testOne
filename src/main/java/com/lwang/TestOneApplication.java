package com.lwang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * TestOneApplication.class
 *
 * @author lwang
 * @date 2017/11/10.
 */
@SpringBootApplication
@MapperScan(basePackages = "com.lwang.dao")
public class TestOneApplication {

    public static void main(String[] args) {

        // 启动Spring Boot项目
        SpringApplication.run(TestOneApplication.class, args);
    }

}
