package encapsulation.vehiclerentalsystem;

// Truck.java (Subclass)
public class Truck extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Truck(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, type, rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 1.5; // Trucks may have a higher rate multiplier
    }

    @Override
    public double calculateInsurance() {
        return 1000.0; // Example fixed insurance rate
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance Policy: " + insurancePolicyNumber;
    }
}


