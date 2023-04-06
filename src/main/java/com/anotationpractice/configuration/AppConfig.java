package com.anotationpractice.configuration;

import com.anotationpractice.controller.PizzaController;
import com.anotationpractice.service.NonVegPizza;
import com.anotationpractice.service.Pizza;
import com.anotationpractice.service.VegPizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    /*
    Before we used the annotation based configuration, for creating bean using @component annotation
    Now, we are creating the java base configuration, in this case, we will create some methods which
    will produce the beans, methods tells spring ioc the bean definitions
     */

    @Bean
    public Pizza vegPizza(){
        return new VegPizza();
    }

    @Bean(name = "myNonVegPizza")
    public Pizza nonVegPizza(){
        return new NonVegPizza();
    }

    // dependency injection for pizza-controller in java base configuration
    // before we used the @autowired annotation to inject the beans of a class
    // controller is the bean name now
    // then pass the implementation of the class to be injected.
    @Bean
    public PizzaController controller(){
        return new PizzaController(nonVegPizza());
    }
}
