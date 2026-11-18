
package com.cjc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Create {

    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        cfg.addAnnotatedClass(Employee.class);

        try (SessionFactory sf = cfg.buildSessionFactory();
             Session s = sf.openSession()) {

            Transaction tx = s.beginTransaction();

            //Employee e = new Employee(1, "Ved", 50000);
            Employee e1 = new Employee(2, "sam", 50000);
            Employee e2 = new Employee(3, "ron", 50000);
            Employee e3= new Employee(4, "monk", 50000);

            //s.persist(e);
            s.persist(e1);
            s.persist(e2);
            s.persist(e3);

            tx.commit();

            System.out.println("Employee inserted successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
