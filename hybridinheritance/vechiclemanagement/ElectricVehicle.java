package hybridinheritance.vechiclemanagement;

class ElectricVehicle extends Vehicle {
    ElectricVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    void charge() {
        System.out.println(model + " is charging.");
        System.out.println(maxSpeed + " of this model");

    }
}
