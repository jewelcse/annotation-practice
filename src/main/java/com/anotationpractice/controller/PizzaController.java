package com.anotationpractice.controller;

import com.anotationpractice.service.Pizza;
import com.anotationpractice.service.VegPizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PizzaController {

    @Qualifier("vegPizza")
    @Autowired
    private Pizza pizza;

    public String getPizza() {
        return pizza.getPizza();
    }
}
