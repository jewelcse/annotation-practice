package com.anotationpractice.configuration;

import com.anotationpractice.controller.PizzaController;
import com.anotationpractice.service.NonVegPizza;
import com.anotationpractice.service.Pizza;
import com.anotationpractice.service.VegPizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {




    @Bean(name = "myNonVegPizza")
    public Pizza nonVegPizza(){
        return new NonVegPizza();
    }

    // dependency injection for pizza-controller in java base configuration
    // before we used the @autowired annotation to inject the beans of a class
    // controller is the bean name now
    // then pass the implementation of the class to be injected.
//    @Bean(initMethod = "init", destroyMethod = "destroy")
//    public PizzaController controller(){
//        return new PizzaController(nonVegPizza());
//    }


    // had two default methods: initMethod and destroyMethod
    // we can use this before and after create the bean, this is java based configuration
    // but in annotation based configuration, @PostConstruct is used initialize before create the bean
    // and @PreDestroy is used when the bean is being destroyed.
    @Bean(initMethod = "init", destroyMethod = "destroy")
    public PizzaController controller(){
        return new PizzaController(nonVegPizza());
    }

}

