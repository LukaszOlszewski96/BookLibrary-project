package Tests;
import library.Library;
import client.Person;
import client.Book;


import java.util.List;

class LibraryTest {

    public static void main(String[] args) {
        Library l = new Library();
        l.insertPerson("Mark","Zurr","0910929941");
        List<Person> person = l.selectPerson();

       System.out.println("Lists of persons:");
       for(Person p: person)
          System.out.println(p);
        l.insertBook("Wwwww","wewae","wrsad","wwwwwww",200,"34");
        List<Book> books = l.selectBook();
        System.out.println("Lists of books:");
        for (Book b: books)
            System.out.println(b);
        l.closeConnection();
    }
}