import java.util.*;
public class Library_System {
    public static void main(String[] args) {
        Book b1 = new Textbook("Linear Algebra","David","Mathematics");
        Book b2 = new Textbook("Angular Script","Tom","Programming");
        Book b3 = new Textbook("German B2","Lisa","Linguistics");
        Book b4 = new Novel("The Million Pound Bank Note", "Mark Twain","Satire");
        ArrayList<Book> books = new ArrayList<>();
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        for (Book book : books) {
            book.displayType();
            book.showInfo();
        }
    }
}

abstract class Book {
    private String title;
    private String author;
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    String getTitle() {
        return this.title;
    }
    String getAuthor() {
        return this.author;
    }
    void showInfo(){
        System.out.println("Title: " + this.title + "\nAuthor: " + this.author);
    }
    abstract void displayType();
}

class Textbook extends Book {
    String subject;
    Textbook(String title, String author, String subject) {
        super(title, author);
        this.subject = subject;
    }
    public void displayType(){
        System.out.println("This is a textbook on "+subject);
    }
}

class Novel extends Book {
    String genre;
    Novel(String title, String author, String genre) {
        super(title, author);
        this.genre = genre;
    }
    public void displayType(){
        System.out.println("This is a "+genre+" Novel.");
    }
}
