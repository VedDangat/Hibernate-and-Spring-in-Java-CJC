package com.cjc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Employee e1 = context.getBean(Employee.class);
        Employee e2 = context.getBean(Employee.class);

        e1.work();

        System.out.println(e1 == e2);
    }
}