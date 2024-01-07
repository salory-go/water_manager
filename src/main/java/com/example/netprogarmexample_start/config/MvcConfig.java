package com.example.netprogarmexample_start.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 项目名: netProgramExample_start
 * 文件名: MvcConfig
 * 创建者: LZS
 * 创建时间:2024/1/6 20:53
 * 描述:
 **/
@Configuration
public class MvcConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(new Interceptor()).addPathPatterns("/login");
    }

}
