package com.anotationpractice.controller;

import com.anotationpractice.service.Pizza;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


// @Controller annotation is used like @Component for creating the bean of the class.
// It's handle by spring IOC

@Controller
public class PizzaController {

    private Pizza pizza;

    @Autowired
    public PizzaController(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getPizza() {
        return pizza.getPizza();
    }


    private void init() {
        System.out.println("Initialize the controller logic");
    }

    private void destroy() {
        System.out.println("Destroy the controller logic");
    }

}
