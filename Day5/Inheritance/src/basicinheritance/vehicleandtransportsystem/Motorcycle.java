package basicinheritance.vehicleandtransportsystem;

class Motorcycle extends Vehicle {

    int seatCapacity;

    Motorcycle(int maxSpeed, String fuelType, int seatCapacity){
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Seat Capacity of Motorcycle : " + seatCapacity );
    }
}