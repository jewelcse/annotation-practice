package com.anotationpractice.service;

import org.springframework.stereotype.Component;

@Component
public class PizzaService {

    public String getVegPizza() {
        return "Veg Pizza!";
    }
}
