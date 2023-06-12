package com.anotationpractice;

import com.anotationpractice.controller.PizzaController;
import com.anotationpractice.service.PizzaService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AnotationPracticeApplication {

    public static void main(String[] args) {

        var context = SpringApplication.run(AnotationPracticeApplication.class, args);

        PizzaController controller = context.getBean(PizzaController.class);
        System.out.println(controller.getPizza());
    }

}
