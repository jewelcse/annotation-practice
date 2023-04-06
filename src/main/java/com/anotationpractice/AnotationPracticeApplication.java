package com.anotationpractice;

import com.anotationpractice.controller.PizzaController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AnotationPracticeApplication {

    public static void main(String[] args) {
        var context = SpringApplication.run(AnotationPracticeApplication.class, args);

        PizzaController controller = context.getBean(PizzaController.class);
        System.out.println(controller.getPizza());


    }

}
