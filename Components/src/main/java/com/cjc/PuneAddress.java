package com.cjc;

import org.springframework.stereotype.Component;

@Component("pune")
public class PuneAddress extends Address {

    @Override
    public void display() {
        System.out.println("City: Pune");
        System.out.println("State: Maharashtra");
    }
}