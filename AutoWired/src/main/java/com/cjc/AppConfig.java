package com.cjc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class AppConfig {

    @Bean
    public Address address() {

        Address a = new Address();

        a.setCity("Pune");
        a.setState("Maharashtra");

        return a;
    }

    @Bean
    public Student student() {

        Student s = new Student();

        s.setId(101);
        s.setName("Ved");

        s.setSubjects(Arrays.asList(
                "Java",
                "Spring",
                "Hibernate",
                "Python"
        ));

        return s;
    }
}