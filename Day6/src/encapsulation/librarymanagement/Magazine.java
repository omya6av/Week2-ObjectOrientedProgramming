package encapsulation.librarymanagement;

//Create magazine subclass
public class Magazine extends LibraryItem implements Reservable {
    private boolean isAvailable;

    // Constructor
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isAvailable = true;
    }

    // Method for loan duration
    public int getLoanDuration() {
        return 7; // Magazines can be loaned for 7 days
    }

    //method reserve items
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
