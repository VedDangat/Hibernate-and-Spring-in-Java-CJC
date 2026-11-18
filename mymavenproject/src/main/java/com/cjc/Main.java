package com.cjc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/collej";
        String username = "root";
        String password = "root123";

        Connection con = DriverManager.getConnection(url, username, password);

        System.out.println("Database connected successfully!");

        Statement stmt = con.createStatement();

        ResultSet rs = stmt.executeQuery("SELECT * FROM student");

        while (rs.next()) {
            System.out.println(
                    rs.getInt("id") + " " +
                            rs.getString("name") + " " +
                            rs.getString("email") + " " +
                            rs.getString("course") + " " +
                            rs.getInt("marks")
            );
        }

        rs.close();
        stmt.close();
        con.close();

        System.out.println("Database connection closed.");
    }
}
