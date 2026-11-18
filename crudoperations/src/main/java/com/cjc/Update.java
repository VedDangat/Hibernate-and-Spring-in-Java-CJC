package com.cjc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Update {

    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        cfg.addAnnotatedClass(Employee.class);

        try (SessionFactory sf = cfg.buildSessionFactory();
             Session s = sf.openSession()) {

            Transaction tx = s.beginTransaction();

            Employee e = s.get(Employee.class, 1);

            if (e != null) {
                e.setEname("Rahul");
                e.setEsalary(60000);

                tx.commit();

                System.out.println("Employee updated successfully!");
            } else {
                tx.rollback();
                System.out.println("Employee not found!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
