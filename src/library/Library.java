package library;
import java.sql.*;

public class Library {
    public static void main(String[] args) {

    }
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
    }

    public boolean insertBook ( int id, String title, String author, String publishingHouse, String language, int pages, String premiere) {
        try {
            PreparedStatement prestatement = connection.prepareStatement("insert into  books values(NULL,?,?,?,?,?,?);");
            prestatement.setInt(1,id);
            prestatement.setString(2,title);
            prestatement.setString(3,author);
            prestatement.setString(4,publishingHouse);
            prestatement.setString(5,language);
            prestatement.setInt(6,pages);
            prestatement.setInt(7,pages);
            prestatement.setString(6,premiere);
            prestatement.execute();
        }catch(SQLException e) {
            System.err.println("Problem with adding book");
        return false;
        }
        return true;
    }
}

