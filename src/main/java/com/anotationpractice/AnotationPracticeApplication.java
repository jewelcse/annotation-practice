package com.anotationpractice;

import com.anotationpractice.value.ValueAnnotationDemo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AnotationPracticeApplication {

    public static void main(String[] args) {
        // get the application context
        var context = SpringApplication.run(AnotationPracticeApplication.class, args);

        // 3 ways to get the value
        // 1. from @Value("our value")
        // 2. from application.properties file
        // 3. from the system variables

        ValueAnnotationDemo valueAnnotationDemo = context.getBean(ValueAnnotationDemo.class);
        System.out.println(valueAnnotationDemo.toString());
    }

}
