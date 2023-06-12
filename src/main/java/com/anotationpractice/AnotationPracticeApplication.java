package com.anotationpractice;

import com.anotationpractice.service.VegPizza;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AnotationPracticeApplication {

    public static void main(String[] args) {
        var context = SpringApplication.run(AnotationPracticeApplication.class, args);

        VegPizza pizza = (VegPizza) context.getBean("vegPizza");
        System.out.println(pizza.getPizza());


    }

}
