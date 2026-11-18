package com.cjc;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

public class Student {

    private int id;
    private String name;
    private List<String> subjects;

    @Autowired
    private Address address;

    // Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    // Display Method

    public void display() {

        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Subjects: " + subjects);

        System.out.println("City: " + address.getCity());
        System.out.println("State: " + address.getState());
    }
}