package com.cjc;

public class Address {

    private String city;
    private String state;

    // Parameterized Constructor
    public Address(String city, String state) {
        this.city = city;
        this.state = state;
    }

    // Getters

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }
}