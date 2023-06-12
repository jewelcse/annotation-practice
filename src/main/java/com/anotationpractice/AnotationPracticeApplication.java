package com.anotationpractice;

import com.anotationpractice.component.PizzaService;
import com.anotationpractice.manual.ManualVegPizza;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AnotationPracticeApplication {

    public static void main(String[] args) {


        // manual way to get the object of ManualVegPizza Class
        ManualVegPizza vegPizza = new ManualVegPizza();
        System.out.println(vegPizza.getManualVegPizza());


        var context = SpringApplication.run(AnotationPracticeApplication.class, args);
        // there are 3 ways to get the beans from application context
        // Using the direct class name, we can get the bean
        PizzaService pizzaService0 = context.getBean(PizzaService.class);
        System.out.println(pizzaService0.getVegPizza());


        // class name can also be treated as a bean name if and only if the first letter of
        // the class is small letter, and we will get
        // bean not found runtime exception. if the bean name as the same as class name
        // within the double quotation
        PizzaService pizzaService1 = (PizzaService) context.getBean("pizzaService");
        System.out.println(pizzaService1.getVegPizza());

        // @component(value="mypizza") is used to get the bean
        // and need to typecast the class
        //PizzaService pizzaService2 = (PizzaService) context.getBean("mypizza");
        //System.out.println(pizzaService2.getVegPizza());



    }

}
