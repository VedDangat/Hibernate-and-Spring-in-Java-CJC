package com.cjc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        // Getting Student object from Spring container
        Student s1 = context.getBean(Student.class);

        // Setting Student values using setters
        s1.setId(101);
        s1.setName("Ved");

        // Setting List of subjects
        s1.setSubjects(Arrays.asList(
                "Java",
                "Spring",
                "Hibernate",
                "Python"
        ));

        // Getting Address object from Spring container
        Address a1 = context.getBean(Address.class);

        a1.setCity("Pune");
        a1.setState("Maharashtra");

        // Injecting Address object into Student
        s1.setAddress(a1);

        // Displaying details
        s1.display();

        //=========2nd STUDENT=========================

        // Getting Student object from Spring container
        Student s2 = context.getBean(Student.class);

        // Setting Student values using setters
        s2.setId(102);
        s2.setName("KARAN");

        // Setting List of subjects
        s1.setSubjects(Arrays.asList(
                "Java",
                "Spring",
                "DevOps",
                "C++"
        ));

        // Getting Address object from Spring container
        Address a2 = context.getBean(Address.class);

        a2.setCity("Nashik");
        a2.setState("Maharashtra");

        // Injecting Address object into Student
        s2.setAddress(a2);

        // Displaying details
        s2.display();


        context.close();
    }
}