package com.anotationpractice;

import com.anotationpractice.controller.PizzaController;
import com.anotationpractice.service.NonVegPizza;
import com.anotationpractice.service.Pizza;
import com.anotationpractice.service.VegPizza;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AnotationPracticeApplication {

    public static void main(String[] args) {
        var context = SpringApplication.run(AnotationPracticeApplication.class, args);

        PizzaController controller = (PizzaController) context.getBean("controller");
        System.out.println(controller.getPizza());


    }

}
