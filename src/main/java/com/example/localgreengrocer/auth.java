package com.example.localgreengrocer;
import java.sql.*;

public class auth {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/user_authentication?allowPublicKeyRetrieval=true&&useSSL=false";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "temmuz*167BA.";

    public void signUp(String username, String password, String role, boolean termsAccepted) throws TermsNotAcceptedException {
        if (!termsAccepted) {
            // Throw an exception or return an error code to indicate that terms were not accepted.
            throw new TermsNotAcceptedException("Terms of Use & Privacy Policy must be accepted.");
        }

        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
            String query = "INSERT INTO users (username, password, role) VALUES (?, ?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, username);
                preparedStatement.setString(2, password);
                preparedStatement.setString(3, role);
                preparedStatement.executeUpdate();
                System.out.println("User signed up successfully!");
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }

    public String authenticate(String username, String password) {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
            String query = "SELECT role FROM users WHERE username = ? AND password = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, username);
                preparedStatement.setString(2, password);

                ResultSet resultSet = preparedStatement.executeQuery();
                if (resultSet.next()) {
                    // Valid credentials, return the role
                    return resultSet.getString("role");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // Invalid credentials
        return null;
    }
}