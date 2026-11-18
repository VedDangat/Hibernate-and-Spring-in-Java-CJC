
package com.databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Try {

    public static void main(String[] args)
            throws SQLException, ClassNotFoundException {

        // load the driver class
        Class.forName("com.mysql.cj.jdbc.Driver");

        // establish connection with database
        String url = "jdbc:mysql://localhost:3306/newjdbc";
        String username = "root";
        String password = "root123";

        Connection con = DriverManager.getConnection(url, username, password);

        // construct the sql query

        //String query = "create table employee(empid int primary key, name varchar(20), department varchar(20), salary float)";
        String q = "INSERT INTO employee VALUES " +
                "(101, 'ved', 'backend', 5000.10), " +
                "(102, 'soham', 'linux', 4500.2), " +
                "(103, 'aastha', 'testing', 3400.12)";

        // create object of statement
        Statement stm = con.createStatement();

        // submit sql query
        //stm.execute(query);
        stm.execute(q);

        // close connection
        stm.close();
        con.close();

        System.out.println("operations performed");
    }
}
