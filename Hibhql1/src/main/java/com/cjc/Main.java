package com.cjc;

import org.hibernate.Session;
import org.hibernate.query.Query;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Session session = HibernateUtil
                .getSessionFactory()
                .openSession();

        // 1. Normal HQL query
        String hql1 = "FROM Student";

        Query<Student> query1 =
                session.createQuery(hql1, Student.class);

        List<Student> students1 = query1.list();

        System.out.println("All Students:");
        for (Student s : students1) {
            System.out.println(
                    s.getId() + " " +
                            s.getName() + " " +
                            s.getMarks()
            );
        }

        // 2. Positional parameter
        String hql2 = "FROM Student WHERE marks > ?1";

        Query<Student> query2 =
                session.createQuery(hql2, Student.class);

        query2.setParameter(1, 80);

        System.out.println("\nPositional Parameter (marks > 80):");
        for (Student s : query2.list()) {
            System.out.println(
                    s.getId() + " " +
                            s.getName() + " " +
                            s.getMarks()
            );
        }

        // 3. Named parameter
        String hql3 = "FROM Student WHERE marks > :marks";

        Query<Student> query3 =
                session.createQuery(hql3, Student.class);

        query3.setParameter("marks", 80);

        System.out.println("\nNamed Parameter (marks > 80):");
        for (Student s : query3.list()) {
            System.out.println(
                    s.getId() + " " +
                            s.getName() + " " +
                            s.getMarks()
            );
        }

        session.close();
        HibernateUtil.getSessionFactory().close();
    }
}
