// Class to represent a MovieTicket 
class MovieTicket {

    // Instance variables to store MovieTicket details
    String movieName;
    int seatNumber;
    double price;

    // Constructor to initialize the MovieTicket object
    MovieTicket(String movieName) {
        this.movieName = movieName;
        this.seatNumber = 0;
        this.price = 0;
    }

    // Book the ticket
    public void bookingTicket(int seatNumber, double price) {

        this.seatNumber = seatNumber;
        this.price = price;

        System.out.println("Book the seatNumber : " + seatNumber + ", and price of ticket is : " + price);

    }

    // Method to display MovieTicket details
    public void display() {
        System.out.println("Movie name : " + movieName +
                ", \nSeat Number : " + seatNumber +
                ", \nPrice  : " + price);
    }

}

// Main class to run the program
class Main {
    public static void main(String[] args) {

        MovieTicket ticket1 = new MovieTicket("Marco");
        // book the ticket
        ticket1.bookingTicket(35, 280);

        // display the movie details
        ticket1.display();
    }
}
