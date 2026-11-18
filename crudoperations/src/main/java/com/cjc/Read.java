
package com.cjc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Read {

    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        cfg.addAnnotatedClass(Employee.class);

        try (SessionFactory sf = cfg.buildSessionFactory();
             Session s = sf.openSession()) {

            Employee e = s.get(Employee.class, 1);

            if (e != null) {
                System.out.println("ID: " + e.getEid());
                System.out.println("Name: " + e.getEname());
                System.out.println("Salary: " + e.getEsalary());
            } else {
                System.out.println("Employee not found!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
