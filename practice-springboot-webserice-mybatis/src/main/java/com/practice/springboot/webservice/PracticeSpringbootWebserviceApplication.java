package com.practice.springboot.webservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackageClasses = PracticeSpringbootWebserviceApplication.class)
@SpringBootApplication
public class PracticeSpringbootWebserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PracticeSpringbootWebserviceApplication.class, args);
    }

}
