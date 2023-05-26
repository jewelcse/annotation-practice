package com.anotationpractice.customannotation;


import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import(MyCustomConfiguration.class)
public @interface MyAnnotation {


}
