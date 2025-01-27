package encapsulation.librarymanagement;

public class Main {
    public static void main(String[] args) {
        // Create objects
        LibraryItem book = new Book("l001", "Ramayana", "Shree Valimki");
        LibraryItem magazine = new Magazine("L002", "MahaBharata", "Shree krishna");
        LibraryItem dvd = new DVD("l003", "Shambhaji Maharaj", "Kabir ");

        // Display details
        System.out.println(book.getItemDetails());
        System.out.println("Loan Duration: " + book.getLoanDuration() + " days");
        ((Reservable) book).reserveItem();

        System.out.println("\n" + magazine.getItemDetails());
        System.out.println("Loan Duration: " + magazine.getLoanDuration() + " days");
        ((Reservable) magazine).reserveItem();

        System.out.println("\n" + dvd.getItemDetails());
        System.out.println("Loan Duration: " + dvd.getLoanDuration() + " days");
        ((Reservable) dvd).reserveItem();
    }
}
