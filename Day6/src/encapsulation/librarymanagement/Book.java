package encapsulation.librarymanagement;

//Create Book subclass
public class Book extends LibraryItem implements Reservable {
    private boolean isAvailable;

    // Constructor
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isAvailable = true;
    }

    // Method loan duration

    public int getLoanDuration() {
        return 21; // Books can be loaned for 21 days
    }

    // Reservable methods

    public void reserveItem() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(getTitle() + " has been reserved.");
        } else {
            System.out.println(getTitle() + " is currently unavailable.");
        }
    }
    public boolean checkAvailability() {
        return isAvailable;
    }
}

