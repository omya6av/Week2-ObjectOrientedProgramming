package encapsulation.vehiclerentalsystem;

// Main.java (Demo Class)
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("C123", "Car", 50.0, "CINS123"));
        vehicles.add(new Bike("B456", "Bike", 20.0, "BINS456"));
        vehicles.add(new Truck("T789", "Truck", 100.0, "TINS789"));

        for (Vehicle vehicle : vehicles) {
            System.out.println("Vehicle Type: " + vehicle.getType());
            System.out.println("Rental Cost for 5 days: $" + vehicle.calculateRentalCost(5));

            if (vehicle instanceof Insurable) {
                Insurable insurable = (Insurable) vehicle;
                System.out.println("Insurance Cost: $" + insurable.calculateInsurance());
                System.out.println(insurable.getInsuranceDetails());
            }

            System.out.println("-----------------------");
        }
    }
}




