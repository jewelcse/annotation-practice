package com.anotationpractice.propertySource;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "classpath:mail.properties")
@PropertySource(value = "classpath:db.properties")
public class AppPropertySourceConfig1 {
}
