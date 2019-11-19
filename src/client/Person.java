package client;

public class Person {
    private String imie;
    private String nazwisko;
    private int pesel;
    int id;

    public Person(String imie, String nazwisko, int id){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.id = id;
    }

   public Person(){}

    public String getImie() {
        return imie;
    }
    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getPesel() {
        return pesel;
    }
    public void setPesel(int pesel) {
        this.pesel = pesel;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String toString(){
        return "["+id+"]-"+imie+""+nazwisko+""+pesel;
    }
}
