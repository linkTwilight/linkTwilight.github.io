package com.linstudy.ttsx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.linstudy.ttsx.mapper")
public class TtsxApplication {

    public static void main(String[] args) {
        SpringApplication.run(TtsxApplication.class, args);
    }

}
