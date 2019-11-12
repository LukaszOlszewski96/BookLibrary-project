package client;

public class Rent {
    private int idPerson;
    private int idBook;

    public Rent (int idPerson, int idBook){
        this.idPerson = idPerson;
        this.idBook = idBook;
    }
    public Rent(){}

    public int getIdBook() {
        return idBook;
    }
    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public int getIdPerson() {
        return idPerson;
    }
    public void setIdPerson(int idPerson) {
        this.idPerson = idPerson;
    }
}
