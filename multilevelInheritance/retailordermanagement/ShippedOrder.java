package multilevelInheritance.retailordermanagement;

// Subclass: ShippedOrder (extends Order)
class ShippedOrder extends Order {
    String trackingNumber;

    // Constructor to initialize ShippedOrder details
    ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate); // Call parent constructor
        this.trackingNumber = trackingNumber;
    }

    // Overriding getOrderStatus method
    @Override
    public String getOrderStatus() {
        return "Order shipped, Tracking Number: " + trackingNumber;
    }

    // Method to display shipping details
    @Override
    public void displayOrderDetails() {
        super.displayOrderDetails(); // Display basic order details
        System.out.println("Tracking Number: " + trackingNumber);
    }
}