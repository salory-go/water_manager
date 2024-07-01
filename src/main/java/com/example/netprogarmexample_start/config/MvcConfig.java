package com.example.netprogarmexample_start.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;
@Configuration
public class MvcConfig implements WebMvcConfigurer {

    @Autowired
    private Interceptor interceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry){
        List<String> pathList = new ArrayList<String>();
        pathList.add("/login");
        pathList.add("/login.html");
        registry.addInterceptor(interceptor).addPathPatterns("/**").excludePathPatterns(pathList);
    }

}

//@Configuration
//public class MvcConfig implements WebMvcConfigurer {
//    List<String>
//    @Override
//    public void addInterceptors(InterceptorRegistry registry){
//        registry.addInterceptor(new Interceptor()).excludePathPatterns("/login.html");
//        registry.addInterceptor(new Interceptor()).excludePathPatterns();
//    }
//
//}
