package com.cjc;

import java.util.List;

public class Student {

    private int id;
    private String name;
    private List<String> subjects;
    private Address address;

    // Parameterized Constructor
    public Student(int id, String name, List<String> subjects, Address address) {
        this.id = id;
        this.name = name;
        this.subjects = subjects;
        this.address = address;
    }

    // Getters

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public Address getAddress() {
        return address;
    }

    // Display Method
    public void display() {

        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Subjects: " + subjects);

        System.out.println("Address: " +
                address.getCity() + ", " +
                address.getState());

        System.out.println("--------------------------");
    }
}