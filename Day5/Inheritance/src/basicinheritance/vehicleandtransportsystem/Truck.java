package basicinheritance.vehicleandtransportsystem;

class Truck extends Vehicle {

    int seatCapacity;

    Truck(int maxSpeed, String fuelType, int seatCapacity){
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Seat Capacity of Truck : " + seatCapacity );
    }

}