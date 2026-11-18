package com.cjc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        cfg.addAnnotatedClass(Employee.class);

        SessionFactory sf = cfg.buildSessionFactory();
        Session s = sf.openSession();

        Transaction tx = s.beginTransaction();

        Employee e = new Employee(1, "Ved", 50000);
        Employee e1= new Employee(2, "Soham", 60000);

        s.persist(e);
        s.persist(e1);

        tx.commit();

        s.close();
        sf.close();

        System.out.println("Employee inserted successfully!");
    }
}
