package com.anotationpractice.controller;

import com.anotationpractice.service.Pizza;
import com.anotationpractice.service.VegPizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


public class PizzaController {

    private Pizza pizza;

    public PizzaController(Pizza pizza){
        this.pizza = pizza;
    }

    public String getPizza(){
        return pizza.getPizza();
    }

}
