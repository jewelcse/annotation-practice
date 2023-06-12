package com.anotationpractice.configuration;

import com.anotationpractice.service.VegPizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public VegPizza vegPizza(){

        return new VegPizza();

    }

}
