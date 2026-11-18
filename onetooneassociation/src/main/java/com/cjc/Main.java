package com.cjc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

    public static void main(String[] args) {

        Configuration cfg = new Configuration();

        cfg.setProperty("hibernate.connection.driver_class",
                "com.mysql.cj.jdbc.Driver");
        cfg.setProperty("hibernate.connection.url",
                "jdbc:mysql://localhost:3306/onetooneasso");
        cfg.setProperty("hibernate.connection.username", "root");
        cfg.setProperty("hibernate.connection.password", "root123");
        cfg.setProperty("hibernate.hbm2ddl.auto", "update");

        cfg.addAnnotatedClass(Department.class);
        cfg.addAnnotatedClass(Employee.class);

        SessionFactory sf = cfg.buildSessionFactory();
        Session s = sf.openSession();

        Transaction tx = s.beginTransaction();

       // Department d1 = new Department(1, "IT");
      //  Department d2 = new Department(2, "HR");
        Department d3=new Department(3, "SDE");
        Department d4=new Department(4, "UIUX");

        //s.persist(d1);
       // s.persist(d2);
        s.persist(d3);
        s.persist(d4);

        //Employee e1 = new Employee(101, "Ved", 50000, d1);
       // Employee e2 = new Employee(102, "Rahul", 45000, d1);
       // Employee e3 = new Employee(103, "Priya", 40000, d2);
        Employee e4 = new Employee(104, "Sam", 30000, d3);
        Employee e5 = new Employee(105, "Ronny", 30000, d4);

       // s.persist(e1);
       // s.persist(e2);
       // s.persist(e3);
        s.persist(e4);
        s.persist(e5);

        tx.commit();

        s.close();
        sf.close();

        System.out.println("Tables created and values inserted!");
    }
}
