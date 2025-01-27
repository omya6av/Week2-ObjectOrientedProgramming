package encapsulation.ridehailingapplication;

public class RideHailingMain {
    public static void main(String[] args) {
        // Create different types of vehicles
        Vehicle car = new Car("C001", "oli", 15.0, "Downtown");
        Vehicle bike = new Bike("B001", "Viya", 10.0, "City Center");
        Vehicle auto = new Auto("A001", "Omi", 8.0, "Uptown");

        // Calculate fare dynamically using polymorphism
        Vehicle[] vehicles = {car, bike, auto};
        double distance = 10.0; // Distance in km

        for (Vehicle vehicle : vehicles) {
            vehicle.getVehicleDetails();
            System.out.println("Fare for " + distance + " km: $" + vehicle.calculateFare(distance));
            if (vehicle instanceof GPS) {
                GPS gps = (GPS) vehicle;
                System.out.println("Current Location: " + gps.getCurrentLocation());
                gps.updateLocation("New Location");
                System.out.println("Updated Location: " + gps.getCurrentLocation());
            }
            System.out.println();
        }
    }
}

