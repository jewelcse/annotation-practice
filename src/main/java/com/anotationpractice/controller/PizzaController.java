package com.anotationpractice.controller;

import com.anotationpractice.service.Pizza;
import com.anotationpractice.service.VegPizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PizzaController {

    /*
    @primary annotation is used to set the priority of a bean, to get injected
    it may be alternative of @qualifier annotation
    in this case, @primary annotation is used to class level to define the priority
     */

    @Autowired
    private Pizza pizza;

    public String getPizza() {
        return pizza.getPizza();
    }
}
