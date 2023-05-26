package com.anotationpractice;

import com.anotationpractice.controller.PizzaController;
import com.anotationpractice.lazy.LazyLoader;
import com.anotationpractice.repository.MyRepository;
import com.anotationpractice.scope.PrototypeBeanScope;
import com.anotationpractice.scope.SingletonBeanScope;
import com.anotationpractice.service.MyService;
import com.anotationpractice.service.NonVegPizza;
import com.anotationpractice.service.Pizza;
import com.anotationpractice.service.VegPizza;
import com.anotationpractice.value.ValueAnnotationDemo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AnotationPracticeApplication {

    public static void main(String[] args) {
        var context = SpringApplication.run(AnotationPracticeApplication.class, args);

        // 3 ways to get the value
        // 1. from @Value("our value")
        // 2. from application.properties file
        // 3. from the system variables

        ValueAnnotationDemo valueAnnotationDemo = context.getBean(ValueAnnotationDemo.class);
        System.out.println(valueAnnotationDemo.toString());
    }

}
