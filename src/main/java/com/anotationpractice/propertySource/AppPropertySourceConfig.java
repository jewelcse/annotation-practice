package com.anotationpractice.propertySource;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "classpath:mail.properties")
public class AppPropertySourceConfig {
}
