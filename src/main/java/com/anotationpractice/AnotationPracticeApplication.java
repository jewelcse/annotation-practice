package com.anotationpractice;

import com.anotationpractice.controller.PizzaController;
import com.anotationpractice.lazy.LazyLoader;
import com.anotationpractice.propertySource.PropertySourceDemo;
import com.anotationpractice.propertySource.PropertySourceDemo2;
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

        // @propertySource annotation is used to manage different properties file
        // @Configuration is used with @propertySource
        // @Value is used to get the values from property file

        PropertySourceDemo propertySourceDemo = context.getBean(PropertySourceDemo.class);
        System.out.println(propertySourceDemo.toString());

        PropertySourceDemo2 demo2 = context.getBean(PropertySourceDemo2.class);
        System.out.println(demo2.toString());
    }

}
