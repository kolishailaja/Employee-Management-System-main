package project;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Creates the connection with the MYSQL Database using JDBC;
 * 
 * @author Prathamesh
 *
 */
public class CreateConnection {
    private static final String url = "jdbc:mysql://localhost:3306/employee";
    private static final String password = "password";
    private static final String username = "root";

    public static Connection createc() {
        try {
            System.out.println("DEBUG: Attempting connection with:");
            System.out.println("DEBUG: URL: " + url);
            System.out.println("DEBUG: Username: " + username);
            System.out.println("DEBUG: Password: '" + password + "' (length: " + password.length() + ")");
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("DEBUG: MySQL driver loaded successfully");
            
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("DEBUG: Connection successful!");
            return conn;
        } catch (Exception e) {
            System.err.println("DEBUG: Connection failed: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
}
