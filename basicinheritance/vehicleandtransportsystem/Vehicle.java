package basicinheritance.vehicleandtransportsystem;

class Vehicle {

    int maxSpeed;
    String fuelType;

    Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    public void displayInfo() {
        System.out.println("Max speed of Vehicle : " + maxSpeed + "\nFuel is used in : " + fuelType);
    }

}