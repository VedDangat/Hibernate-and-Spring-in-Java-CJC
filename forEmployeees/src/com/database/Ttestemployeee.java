
package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ttestemployeee {

    public static void main(String[] args)
            throws SQLException, ClassNotFoundException {

        // Load the driver class
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Establish connection
        String url = "jdbc:mysql://localhost:3306/employeees";
        String username = "root";
        String password = "root123";

        Connection con = DriverManager.getConnection(url, username, password);

        // Call the stored procedure
        CallableStatement cs = con.prepareCall("{CALL getEmployee()}");

        // Execute the stored procedure
        ResultSet rs = cs.executeQuery();

        // Display employee records
        while (rs.next()) {
            System.out.println("Employee ID: " + rs.getInt("eid"));
            System.out.println("Name: " + rs.getString("name"));
            System.out.println("Department: " + rs.getString("department"));
            System.out.println("Salary: " + rs.getFloat("salary"));
            System.out.println("-------------------------");
        }

        // Close resources
        rs.close();
        cs.close();
        con.close();

        System.out.println("Procedure executed successfully");
    }
}
