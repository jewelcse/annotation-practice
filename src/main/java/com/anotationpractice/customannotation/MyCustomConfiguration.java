package com.anotationpractice.customannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyCustomConfiguration {

    @Bean
    public String getName() {
        return "my-annotation";
    }


}
