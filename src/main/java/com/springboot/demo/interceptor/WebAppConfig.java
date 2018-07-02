package com.springboot.demo.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootConfiguration
//public class WebAppConfig extends WebMvcConfigurerAdapter {
public class WebAppConfig implements HandlerInterceptor {

 /*       @Autowired
    private InterceptorConfig interceptorConfig;

        @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //注册自定义拦截器，添加拦截路径和排除拦截路径
        registry.addInterceptor(interceptorConfig)
                .addPathPatterns("/**")
                .excludePathPatterns("login");
    }*/


//    @Autowired
    private InterceptorConfig interceptorConfig;

//    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //注册自定义拦截器，添加拦截路径和排除拦截路径
        registry.addInterceptor(interceptorConfig)
                .addPathPatterns("/**")
                .excludePathPatterns("login");
    }


}
