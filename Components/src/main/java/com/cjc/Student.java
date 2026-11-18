package com.cjc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {

    private int id;
    private String name;

    private Address address;

    // Constructor Autowiring

    @Autowired
    public Student(@Qualifier("mumbai") Address address) {

        this.address = address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display() {

        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);

        address.display();
    }
}