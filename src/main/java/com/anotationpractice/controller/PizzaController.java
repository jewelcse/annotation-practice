package com.anotationpractice.controller;

import com.anotationpractice.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PizzaController {
    // field injection applied
    @Autowired
    private PizzaService pizzaService;


    // construct injection applied
    //private PizzaService pizzaService;

    //@Autowired
    //public PizzaController(PizzaService service){
    //    this.pizzaService = service;
    //}


    // setter injection applied
    //private PizzaService pizzaService;

    //@Autowired
    //public void setVegPizza(PizzaService service){
    //   this.pizzaService = service;
    //}

    public String getPizza() {
        return pizzaService.getVegPizza();
    }
}
