package com.cjc;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        cfg.addAnnotatedClass(Student.class);
        cfg.addAnnotatedClass(Course.class);

        SessionFactory sf = cfg.buildSessionFactory();
        Session s = sf.openSession();
        Transaction tx = s.beginTransaction();

        // Create 5 courses
        Course c1 = new Course(101, "Java");
        Course c2 = new Course(102, "Python");
        Course c3 = new Course(103, "AI");
        Course c4 = new Course(104, "DBMS");
        Course c5 = new Course(105, "Cloud Computing");

        s.persist(c1);
        s.persist(c2);
        s.persist(c3);
        s.persist(c4);
        s.persist(c5);

        // Create 5 students with marks
        Student st1 = new Student(1, "Ved", 90);
        Student st2 = new Student(2, "Rahul", 85);
        Student st3 = new Student(3, "Amit", 78);
        Student st4 = new Student(4, "Priya", 92);
        Student st5 = new Student(5, "Sneha", 88);

        // Assign courses to students
        st1.getCourses().add(c1);
        st1.getCourses().add(c2);
        st1.getCourses().add(c3);

        st2.getCourses().add(c1);
        st2.getCourses().add(c4);

        st3.getCourses().add(c2);
        st3.getCourses().add(c5);

        st4.getCourses().add(c3);
        st4.getCourses().add(c4);
        st4.getCourses().add(c5);

        st5.getCourses().add(c1);
        st5.getCourses().add(c2);
        st5.getCourses().add(c3);
        st5.getCourses().add(c4);
        st5.getCourses().add(c5);

        // Save students
        s.persist(st1);
        s.persist(st2);
        s.persist(st3);
        s.persist(st4);
        s.persist(st5);

        tx.commit();

        System.out.println("5 Students with marks inserted!");

        System.out.println("5 Courses inserted!");

        System.out.println("Many-to-Many relationship created!");

        s.close();
        sf.close();
    }
}
