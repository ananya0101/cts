package com.vp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Component
@EnableWebMvc
@ComponentScan(basePackages = "com.vp")
public class AppConfig {
    
}