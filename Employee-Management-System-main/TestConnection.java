import java.sql.Connection;
import java.sql.DriverManager;

public class TestConnection {
    public static void main(String[] args) {
        try {
            System.out.println("Testing MySQL connection...");
            System.out.println("URL: jdbc:mysql://localhost:3306/employee");
            System.out.println("Username: root");
            System.out.println("Password: password");
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("MySQL driver loaded successfully");
            
            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/employee", 
                "root", 
                "password"
            );
            
            System.out.println("Connection successful!");
            conn.close();
            System.out.println("Connection closed.");
            
        } catch (Exception e) {
            System.err.println("Connection failed: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
