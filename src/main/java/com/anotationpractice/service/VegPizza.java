package com.anotationpractice.service;

import org.springframework.stereotype.Component;

//@Component("vegPizza")
@Component
public class VegPizza implements Pizza{


    @Override
    public String getPizza() {
        return "Veg Pizza";
    }
}
