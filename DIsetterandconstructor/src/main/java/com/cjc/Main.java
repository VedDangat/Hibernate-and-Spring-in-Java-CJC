package com.cjc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        // Creating Spring Container
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        // Getting Student objects from Spring Container
        Student s1 = context.getBean("student1", Student.class);

        Student s2 = context.getBean("student2", Student.class);

        // Displaying Student Details
        s1.display();

        s2.display();

        // Closing Container
        context.close();
    }
}