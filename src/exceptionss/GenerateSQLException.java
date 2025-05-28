package exceptionss;
//18. Write a program to generate SQLException

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GenerateSQLException {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            // Attempt to connect with an invalid URL (will cause SQLException)
            String url = "jdbc:mysql://localhost:3306/non_existent_db";
            String username = "invalidUser";
            String password = "invalidPass";

            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connection established successfully.");

        } catch (SQLException e) {
            System.out.println("SQLException caught: " + e.getMessage());
        } finally {
            try {
                if (connection != null) connection.close();
            } catch (SQLException e) {
                System.out.println("Failed to close connection: " + e.getMessage());
            }
        }
    }
}
