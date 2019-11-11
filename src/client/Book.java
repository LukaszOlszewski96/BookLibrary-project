package client;

import java.util.Date;

public class Book {

    //Define Book field:

    private String title;
    private String author;
    private String publishingHouse;
    private String language;
    private int pages;
    private int id;
    private String premiere;

    //Constructor Book with fields:

    public Book(String title,String author, String publishingHouse, String language, String premiere, int pages, int id){
        this.title = title;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.language = language;
        this.premiere = premiere;
        this.pages = pages;
        this.id = id;
    }

    //Empty constructor:

    public Book (){}

    //Metods:

    public String getTitle(){
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author = author;
    }

    public String getPublishingHouse(){
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public String getLanguage(){
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getPages(){
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPremiere(){
        return premiere;
    }

    public void setPremiere(String premiere) {
        this.premiere = premiere;
    }
}
