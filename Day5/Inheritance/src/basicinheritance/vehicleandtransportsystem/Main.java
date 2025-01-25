package basicinheritance.vehicleandtransportsystem;

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle(95, "diesel");
        System.out.println("Info of Vehicle");
        vehicle.displayInfo();

        Car grandVitara = new Car(130, "CNG", 5);
        System.out.println("\nDetail of Car : Grand Vitara");
        grandVitara.displayInfo();

        Truck tataTruck = new Truck(160, "Diesel", 2);
        System.out.println("\nDetail of Truck : ");
        tataTruck.displayInfo();

        Motorcycle pulser = new Motorcycle(105, "Petrol" , 3);
        System.out.println("\nDetail of Motorcycle : Pulser");
        pulser.displayInfo();

    }
}
