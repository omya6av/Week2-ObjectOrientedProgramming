import java.util.ArrayList;
import java.util.List;

// Book Class
class Book {
    String title;
    String author;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // toString Method for Display
    @Override
    public String toString() {
        return "TITLE : " + title + " and AUTHOR : " + author;
    }
}

// Library Class
class Library {
    String name;
    List<Book> books; // Aggregation: Library has many Books

    // Constructor
    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    // Add Book to Library
    public void addBook(Book book) {
        books.add(book);
    }

    // Display Books in Library
    public void displayBooks() {
        System.out.println("Books in " + name + " Library:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

}

// Main Class to Test Aggregation
class LibraryAggregationExample {
    public static void main(String[] args) {
        // Creating Books
        Book book1 = new Book("War and Peace", "Leo Tolstoy");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book book3 = new Book("The White Tiger", "Aravind Adiga");

        // Creating Libraries
        Library library1 = new Library("The Book hub ");
        Library library2 = new Library("City ");

        // Adding Books to Libraries
        library1.addBook(book1);
        library1.addBook(book2);

        library2.addBook(book1); // Same book can exist in another library
        library2.addBook(book3);

        // Displaying Books in Libraries
        library1.displayBooks();
        library2.displayBooks();
    }
}
){
 
 this.title = title; 
 this.author = author; 
 
 }
  
 
}