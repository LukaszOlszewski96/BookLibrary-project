package library;
import client.Book;
import client.Person;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class Library {
    public static final String DB_URL = "jdbc:mysql://127.0.0.1/librarydb";
    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
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
            connection = DriverManager.getConnection(DB_URL,"root","");
            statement = connection.createStatement();
        } catch (SQLException e) {
            System.err.println("Problem with connection");
            e.printStackTrace();
        }
    }

    public boolean insertBook ( String title, String author, String publishingHouse, String language, int pages, String premiere) {
        try {
            PreparedStatement prestatement = connection.prepareStatement("insert into  books values(NULL,?,?,?,?,?,?);");
            prestatement.setString(1,title);
            prestatement.setString(2,author);
            prestatement.setString(3,publishingHouse);
            prestatement.setString(4,language);
            prestatement.setInt(5,pages);
            prestatement.setString(6,premiere);
            prestatement.execute();
        }catch(SQLException e) {
            System.err.println("Problem with adding book");
        return false;
        }
        return true;
    }

    public boolean insertPerson (String imie, String nazwisko, String pesel) {
        try {
            PreparedStatement prestatement = connection.prepareStatement("insert into presons values(NULL,?,?,?);");
            prestatement.setString(1,imie);
            prestatement.setString(2,nazwisko);
            prestatement.setString(3,pesel);
            prestatement.execute();
        }catch(SQLException e) {
            System.err.println("Problem with adding person");
            return false;
        }
        return true;
    }

    public boolean insertRent ( int idPerson, int idBook) {
        try {
            PreparedStatement prestatement = connection.prepareStatement("insert into rent values(NULL,?,?);");
            prestatement.setInt(1,idPerson);
            prestatement.setInt(2,idBook);
            prestatement.execute();
        }catch(SQLException e) {
            System.err.println("Problem with rent");
            return false;
        }
        return true;
    }

    public List<Book> selectBook(){
        List<Book> book = new LinkedList<Book>();
        try{
            ResultSet result = statement.executeQuery("select * from books");
            int id;
            String title;
            String author;
            String publishingHouse;
            String language;
            int pages;
            String premiere;
            while (result.next()) {
                id = result.getInt("id_book");
                title = result.getString("title");
                author = result.getString("author");
                publishingHouse = result.getString("publishingHouse");
                language = result.getString("language");
                pages = result.getInt("pages");
                premiere = result.getString("premiere");
                book.add(new Book(premiere, title, author, publishingHouse, language, pages, id));
            }
            }catch (SQLException e){
                e.printStackTrace();
                return null;
            }
        return book;
        }
    public List<Person> selectPerson() {
        List <Person> person = new LinkedList<>();
        try {
            ResultSet resultSet = statement.executeQuery("SELECT * FROM presons");
            String imie;
            String nazwisko;
            String pesel;
            int id;
            while (resultSet.next()) {
                id = resultSet.getInt("id_preson");
                imie = resultSet.getString("imie");
                nazwisko = resultSet.getString("nazwisko");
                pesel = resultSet.getString("pesel");
                person.add(new Person(id, imie, nazwisko, pesel));
            }
            }catch (SQLException e){
                e.printStackTrace();
                return null;
            }
            return person;
        }
    public void closeConnection(){
        try{
            connection.close();
        }catch(SQLException e){
            System.err.println("Problem with close connection!!!");
            e.printStackTrace();
        }
    }
    }



