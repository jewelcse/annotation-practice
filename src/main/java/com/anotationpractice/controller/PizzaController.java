package com.anotationpractice.controller;

import com.anotationpractice.dto.Data;
import com.anotationpractice.service.Pizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

// @Controller annotation is used like @Component for creating the bean of the class.
// It's handle by spring IOC

@RestController
public class PizzaController {

    //@Qualifier("NonVegPizza")
    @Autowired
    private Pizza pizza;


    @GetMapping("/pizza1")
    public String getPizza1() {
        return pizza.getPizza();
    }

    @GetMapping("/pizza2/{name}")
    public String getPizza2(@PathVariable String name) {
        return name;
    }

    @GetMapping("/pizza3")
    public String getPizza3(@RequestParam String name) {
        return name;
    }

    @GetMapping("/pizza4")
    public String getPizza4(@RequestParam(defaultValue = "Italian pizza") String name) {
        return name;
    }

    @GetMapping("/pizza5")
    public String getPizza5(@RequestParam(required = true) String name,
                            @RequestParam(required = true) String type,
                            @RequestParam(required = false, defaultValue = "normal") String extraSpec

    ) {

        return "Yours order, pizza name: " + name + " , type: " + type + " , extraSpec: " + extraSpec;
    }

    @PostMapping("/pizza6")
    public String savePizza6(@RequestBody Data request){
        return "Yours order, pizza name: " + request.getName();
    }

    @PostMapping("/pizza7")
    public Data savePizza7(@RequestBody Data request){
        return request;
    }






}
