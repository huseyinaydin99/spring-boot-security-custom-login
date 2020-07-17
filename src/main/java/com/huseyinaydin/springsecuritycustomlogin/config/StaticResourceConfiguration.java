package com.huseyinaydin.springsecuritycustomlogin.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class StaticResourceConfiguration extends WebMvcConfigurationSupport {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        /*registry
                .addResourceHandler("/resources/**")
                .addResourceLocations("/resources/");*/
        registry
                .addResourceHandler("/images/**")
                .addResourceLocations("classpath:/static/images/");
    }
}
