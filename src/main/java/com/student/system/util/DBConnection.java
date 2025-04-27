package com.student.system.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    public static Connection getConnection() {
        Connection conn = null;

        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Database connection URL
            String url = "jdbc:mysql://localhost:3306/student_db";
            String username = "root";        // your MySQL username
            String password = "your_password"; // your MySQL password

            // Establish the connection
            conn = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found.");
        } catch (SQLException e) {
            System.out.println("Database connection failed.");
        }

        return conn;
    }
}
