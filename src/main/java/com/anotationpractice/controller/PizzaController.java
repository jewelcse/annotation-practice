package com.anotationpractice.controller;

import com.anotationpractice.service.Pizza;
import com.anotationpractice.service.VegPizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PizzaController {
    /*
    consider an interface have more than one implementation, in this case,
    if you want to inject the bean of one of this implementation class,
    then without qualify the bean name, spring ioc get confused, which bean can be injected.
    In this case, @qualifier annotation is used to make a decision, which implementation class will be
    injected and used for a particular class's.
     */

    @Qualifier("vegPizza")
    @Autowired
    private Pizza pizza;

    public String getPizza() {
        return pizza.getPizza();
    }
}
