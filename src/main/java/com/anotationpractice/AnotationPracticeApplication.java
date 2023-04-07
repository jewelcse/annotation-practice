package com.anotationpractice;

import com.anotationpractice.controller.PizzaController;
import com.anotationpractice.lazy.LazyLoader;
import com.anotationpractice.repository.MyRepository;
import com.anotationpractice.service.MyService;
import com.anotationpractice.service.NonVegPizza;
import com.anotationpractice.service.Pizza;
import com.anotationpractice.service.VegPizza;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AnotationPracticeApplication {

    public static void main(String[] args) {
        var context = SpringApplication.run(AnotationPracticeApplication.class, args);

        // on demand the bean is loaded and got the output
        // on the other hand, Eager Loader is loaded before while the application is bootstrapped
        // @Lazy annotation is used with @Component, @Bean, @Configuration annotation
        LazyLoader loader = context.getBean(LazyLoader.class);
        System.out.println(loader.getMessage());
    }

}
