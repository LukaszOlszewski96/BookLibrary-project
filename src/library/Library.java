package library;
import java.sql.*;

public class Library {
    public static final String DB_URL = "jdbc:mysql://localhost:3306/librasydb";
    public static final String DRIVER = "com.mysql.jdbc.Driver";
    private Connection connection = null;
    private Statement statement = null;

    public Library() {
        try {
            Class.forName(Library.DRIVER);
        } catch (ClassNotFoundException e) {
            System.err.println("Driver not found");
            e.printStackTrace();
        }

        try {
            connection = DriverManager.getConnection(DB_URL);
            statement = connection.createStatement();
        } catch (SQLException e) {
            System.err.println("Problem with connection");
            e.printStackTrace();
        }
        createTables();
    }
    public boolean createTables(){
        String createBooks = "CREATE TABLE IF NOT EXISTS books (id_book INTEGER PRIMARY KEY AUTOINCREMENT,   )";
    }
}
