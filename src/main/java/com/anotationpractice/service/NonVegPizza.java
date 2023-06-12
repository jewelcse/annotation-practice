package com.anotationpractice.service;

import org.springframework.stereotype.Component;

//@Component("nonVegPizza")
@Component
public class NonVegPizza implements Pizza{


    @Override
    public String getPizza() {
        return "Non-Veg Pizza";
    }
}
