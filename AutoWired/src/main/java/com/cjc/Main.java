package com.cjc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        // Getting Student object
        Student s1 = context.getBean(Student.class);

        // Displaying Details
        s1.display();

        context.close();
    }
}