package com.database;

import java.sql.*;

public class Test {

    public static void main(String[] args)
            throws ClassNotFoundException, SQLException {

        // 1. Load the driver class
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 2. Establish connection with database
        String url = "jdbc:mysql://localhost:3306/studdd";
        String username = "root";
        String password = "root123";

        Connection con =
                DriverManager.getConnection(url, username, password);

        // 3. Construct the SQL query
       // String query = "create table students(roll_no int primary key, name varchar(20), marks float, department varchar(20))";
        String query = "insert into students values(101,'ved',92.16,'cse'),(102,'sam',90.11,'mech'),(103,'ron',89,'civil')";
        // 4. Create object of Statement
        Statement stm = con.createStatement();

        // 5. Submit SQL query
        stm.execute(query);

        // 6. Close connection
        stm.close();
        con.close();

        System.out.println("operation performed");
    }
}
