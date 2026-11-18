package com.cjc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Employee e1 = context.getBean(Employee.class);
        Employee e2 = context.getBean(Employee.class);
        Employee e3 = context.getBean(Employee.class);
        Employee e4 = context.getBean(Employee.class);

        e1.work();
        e2.work();
        e3.work();
        e4.work();

        System.out.println(e1 == e2);
        System.out.println(e2 == e3);
        System.out.println(e3 == e4);
    }
}