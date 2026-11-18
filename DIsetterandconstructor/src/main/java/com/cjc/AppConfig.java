package com.cjc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class AppConfig {

    @Bean
    public Address address1() {
        return new Address("Pune", "Maharashtra");
    }

    @Bean
    public Address address2() {
        return new Address("Nashik", "Maharashtra");
    }

    @Bean
    public Student student1() {
        return new Student(
                101,
                "Ved",
                Arrays.asList("Java", "Spring", "Hibernate", "Python"),
                address1()
        );
    }

    @Bean
    public Student student2() {
        return new Student(
                102,
                "Karan",
                Arrays.asList("Java", "Spring", "DevOps", "C++"),
                address2()
        );
    }
}