package com.cjc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main {

    public static void main(String[] args) throws Exception {

        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();

            Student s1 = new Student("Ved Dangat", "ved@gmail.com", "CSE", 90);
            Student s2 = new Student("Aayush Potdar", "aayush@gmail.com", "CSE", 85);
            Student s3 = new Student("Harshal Ugale", "harshal@gmail.com", "CSE", 88);
            Student s4 = new Student("Aashish Kardile", "aashish@gmail.com", "CSE", 92);
            Student s5 = new Student("Rahul Patil", "rahul@gmail.com", "CSE", 80);

            session.persist(s1);
            session.persist(s2);
            session.persist(s3);
            session.persist(s4);
            session.persist(s5);

            tx.commit();

            System.out.println("5 students inserted successfully!");

        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            throw e;

        } finally {
            session.close();
            factory.close();
        }
    }
}
