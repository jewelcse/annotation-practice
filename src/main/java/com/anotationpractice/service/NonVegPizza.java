package com.anotationpractice.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("NonVegPizza")
@Primary
public class NonVegPizza implements Pizza{

    @Override
    public String getPizza() {
        return "Non-Veg Pizza";
    }
}
