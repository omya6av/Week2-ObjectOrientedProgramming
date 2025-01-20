// Define the Vehicle class
class Vehicle {
    // Class variable for the registration fee (shared by all vehicles)
    static double registrationFee = 1000.00;

    // Instance variables for the owner's name and vehicle type
    String ownerName;
    String vehicleType;

    // Constructor to initialize instance variables
    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display details of the vehicle
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: $" + registrationFee);
    }

    // Class method to update the registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // Main method for testing the Vehicle class
    public static void main(String[] args) {
        // Create instances of the Vehicle class
        Vehicle vehicle1 = new Vehicle("Om yadav", "Range Rover");
        Vehicle vehicle2 = new Vehicle("Tarun yadav", "Pulser");

        // Display details of individual vehicles
        System.out.println("Details of Vehicle 1:");
        vehicle1.displayVehicleDetails();

        System.out.println("\nDetails of Vehicle 2:");
        vehicle2.displayVehicleDetails();

        // Update the registration fee
        Vehicle.updateRegistrationFee(1200.00);

        // Display details again to reflect the updated registration fee
        System.out.println("\nAfter Updating Registration Fee:");
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
    }
}
