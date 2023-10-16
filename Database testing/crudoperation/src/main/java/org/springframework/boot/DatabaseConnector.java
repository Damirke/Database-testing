package org.springframework.boot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CustomDatabaseConnector {
    private static final String CUSTOM_URL = "jdbc:mysql://localhost:3306/mydb";
    private static final String CUSTOM_USERNAME = "custom_user";
    private static final String CUSTOM_PASSWORD = "custom_password";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(CUSTOM_URL, CUSTOM_USERNAME, CUSTOM_PASSWORD);
    }
}