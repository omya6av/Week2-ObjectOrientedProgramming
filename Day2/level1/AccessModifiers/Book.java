// Define the Book class
class Book {
    public String ISBN;             // Public member
    protected String title;         // Protected member
    private String author;          // Private member

    // Constructor to initialize the book details
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Methods to access and modify the author name
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

// Subclass EBook
class EBook extends Book {

    // Constructor to initialize the EBook details
    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    // Method to display EBook details
    public void displayDetails() {
        System.out.println("ISBN: " + ISBN); // Accessing public member
        System.out.println("Title: " + title); // Accessing protected member
    }
}

// Main method
public class LibrarySystem {
    public static void main(String[] args) {
        EBook ebook = new EBook("123-333-789", "Java full stack", "Johnn");
        ebook.displayDetails();

        // Access and modify the author
        ebook.setAuthor("Jane Smith");
        System.out.println("Updated Author: " + ebook.getAuthor());
    }
}
