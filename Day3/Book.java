// Create Book class
class Book {

    // Static variable shared across all books
    static String libraryName = "GuruDev";

    // Final variable for unique ISBN
    final String isbn;

    // Instance variables
    String title;
    String author;

    // Static method to display the library name
    static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // Parameterized constructor
    Book(String title, String author, String isbn) {
        // Using 'this' to resolve ambiguity
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Method to display book details
    void displayBookDetails() {
        if (this instanceof Book) { // Check if the object is an instance of Book
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        } else {
            System.out.println("Invalid book object.");
        }
    }
}

public class LibraryDetail {
    public static void main(String[] args) {

        // Create book objects
        Book book1 = new Book("Next-step", "OM-G", "987654");
        Book book2 = new Book("2011", "Dhoni", "2345678");

        // Display library name
        Book.displayLibraryName();

        // Display book details
        System.out.println("\nBook 1 Details:");
        book1.displayBookDetails();

        System.out.println("\nBook 2 Details:");
        book2.displayBookDetails();
    }
}
