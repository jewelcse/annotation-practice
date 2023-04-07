package com.anotationpractice.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Primary
public class VegPizza implements Pizza{

    @Override
    public String getPizza() {
        return "Veg Pizza";
    }
}
