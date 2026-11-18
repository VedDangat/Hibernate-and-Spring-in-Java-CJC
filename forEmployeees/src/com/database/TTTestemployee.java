
package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.CallableStatement;
import java.sql.SQLException;

public class TTTestemployee {

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
        CallableStatement cs =
                con.prepareCall("{CALL insertEmployee(?, ?, ?, ?)}");

        // Insert 1st employee
        cs.setInt(1, 107);
        cs.setString(2, "NEWVed");
        cs.setString(3, "SDE");
        cs.setFloat(4, 50000.10f);
        cs.executeUpdate();

        // Insert 2nd employee
        cs.setInt(1, 108);
        cs.setString(2, "NEWSam");
        cs.setString(3, "UIUX");
        cs.setFloat(4, 30000.10f);
        cs.executeUpdate();

        // Insert 3rd employee
        cs.setInt(1, 109);
        cs.setString(2, "NEWRonny");
        cs.setString(3, "CICD");
        cs.setFloat(4, 60000.10f);
        cs.executeUpdate();

        // Close resources
        cs.close();
        con.close();

        System.out.println("Employee records inserted successfully!");
    }
}
