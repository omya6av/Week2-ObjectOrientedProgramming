package encapsulation.librarymanagement;

//Create dvd Subclass
public class DVD extends LibraryItem implements Reservable {
    private boolean isAvailable;

    // Constructor
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isAvailable = true;
    }


    public int getLoanDuration() {
        return 14; // DVDs can be loaned for 14 days
    }



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
