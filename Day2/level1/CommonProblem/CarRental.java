// Define the CarRental class
class CarRental {
    // Instance variables
    String customerName;  // Customer's name
    String carModel;      // Rented car model
    int rentalDays;       // Number of days for rental
    double dailyRate;     // Daily rental rate (depends on the car model)

    // Constructor to initialize rental details
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.dailyRate = determineDailyRate(carModel); // Set daily rate based on the car model
    }

    // Method to determine daily rate based on car model
    private double determineDailyRate(String carModel) {
        switch (carModel.toLowerCase()) {
            case "neno":
                return 15.00;
            case "suv":
                return 70.00;
            case "hatchback":
                return 40.00;
            default:
                return 60.00; // Default rate for unknown models
        }
    }

    // Method to calculate the total rental cost
    public double calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    // Method to display rental details
    public void displayRentalDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Daily Rate: " + dailyRate);
        System.out.println("Total Cost: " + calculateTotalCost());
    }

    // Main method for testing the CarRental class
    public static void main(String[] args) {
        // Create a CarRental object with rental details
        CarRental rental = new CarRental("NAman ish", "Neno", 5);

        // Display rental details
        rental.displayRentalDetails();
    }
}
