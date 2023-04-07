package com.anotationpractice.controller;

import com.anotationpractice.service.Pizza;



public class PizzaController {

    private Pizza pizza;

    public PizzaController(Pizza pizza){
        this.pizza = pizza;
    }

    public String getPizza(){
        return pizza.getPizza();
    }

    private void init() {
        System.out.println("Initialize the controller logic");
    }

    private void destroy() {
        System.out.println("Destroy the controller logic");
    }
}
