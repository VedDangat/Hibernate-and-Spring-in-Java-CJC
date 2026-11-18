package com.cjc;

import org.springframework.stereotype.Component;

@Component("mumbai")
public class MumbaiAddress extends Address {

    @Override
    public void display() {
        System.out.println("City: Mumbai");
        System.out.println("State: Maharashtra");
    }
}