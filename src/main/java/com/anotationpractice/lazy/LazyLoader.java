package com.anotationpractice.lazy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class LazyLoader {

    public LazyLoader() {
        System.out.println("Lazy Loader");
    }

    public String getMessage(){
        return "get message";
    }
}
