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
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AnotationPracticeApplication {

    public static void main(String[] args) {
        var context = SpringApplication.run(AnotationPracticeApplication.class, args);

        // by default, spring context provides singleton scope for spring beans


        // singleton scope: In singleton bean scope, the ioc create only one object of a class.
        // while it is called everytime the same instance is carry forward

        SingletonBeanScope singletonBeanScope1 = context.getBean(SingletonBeanScope.class);
        System.out.println(singletonBeanScope1.hashCode());

        SingletonBeanScope singletonBeanScope2 = context.getBean(SingletonBeanScope.class);
        System.out.println(singletonBeanScope2.hashCode());

        SingletonBeanScope singletonBeanScope3 = context.getBean(SingletonBeanScope.class);
        System.out.println(singletonBeanScope3.hashCode());

        // prototype scope: application context create a new instance of the class
        // every request, that's why the hashcode will be different every time

        PrototypeBeanScope prototypeBeanScope1 = context.getBean(PrototypeBeanScope.class);
        System.out.println(prototypeBeanScope1.hashCode());

        PrototypeBeanScope prototypeBeanScope2 = context.getBean(PrototypeBeanScope.class);
        System.out.println(prototypeBeanScope2.hashCode());

        PrototypeBeanScope prototypeBeanScope3 = context.getBean(PrototypeBeanScope.class);
        System.out.println(prototypeBeanScope3.hashCode());

    }

}
