package com.linstudy.ttsx.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MybatisPlusConfig {

    //分页
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return  new PaginationInterceptor();
    }
}
