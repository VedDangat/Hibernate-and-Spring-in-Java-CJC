package com.cjc;

import org.hibernate.Session;

public class Test {

    public static void main(String[] args) {

        Session session1 =
                HibernateUtil.getSessionFactory().openSession();

        Student s1 = session1.get(Student.class, 1);
        System.out.println(s1.getId() + " " + s1.getName());

        Student s2 = session1.get(Student.class, 1);
        System.out.println(s2.getId() + " " + s2.getName());

        session1.close();

        Session session2 =
                HibernateUtil.getSessionFactory().openSession();

        Student s3 = session2.get(Student.class, 1);
        System.out.println(s3.getId() + " " + s3.getName());

        session2.close();

        HibernateUtil.getSessionFactory().close();
    }
}
