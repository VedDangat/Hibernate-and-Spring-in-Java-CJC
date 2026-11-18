package com.database;

import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Testemployeee {

    public static void main(String[] args)
            throws SQLException, ClassNotFoundException {

        // Load the driver class
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Establish connection
        String url = "jdbc:mysql://localhost:3306/employeees";
        String username = "root";
        String password = "root123";

        Connection con = DriverManager.getConnection(url, username, password);

        // Construct SQL query
        String query = "INSERT INTO employee VALUES (?, ?, ?, ?)";

        // Create PreparedStatement
        PreparedStatement ps = con.prepareStatement(query);

        // Insert 1st employee
        ps.setInt(1, 101);
        ps.setString(2, "ved");
        ps.setString(3, "SDE");
        ps.setFloat(4, 50000.10f);
        ps.executeUpdate();

        // Insert 2nd employee
        ps.setInt(1, 102);
        ps.setString(2, "sam");
        ps.setString(3, "UIUX");
        ps.setFloat(4, 30000.10f);
        ps.executeUpdate();

        // Insert 3rd employee
        ps.setInt(1, 103);
        ps.setString(2, "ronny");
        ps.setString(3, "CICD");
        ps.setFloat(4, 60000.10f);
        ps.executeUpdate();

        // Insert 4th employee
        ps.setInt(1, 104);
        ps.setString(2, "karan");
        ps.setString(3, "FRONTEND");
        ps.setFloat(4, 30000.10f);
        ps.executeUpdate();

        // Close resources
        ps.close();
        con.close();

        System.out.println("Operations performed successfully");
    }
}