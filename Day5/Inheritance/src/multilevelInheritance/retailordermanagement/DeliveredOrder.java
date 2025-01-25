package multilevelInheritance.retailordermanagement;

// Subclass: DeliveredOrder (extends ShippedOrder)
class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    // Constructor to initialize DeliveredOrder details
    DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber); // Call parent constructor
        this.deliveryDate = deliveryDate;
    }

    // Overriding getOrderStatus method
    @Override
    public String getOrderStatus() {
        return "Order delivered on: " + deliveryDate;
    }

    // Method to display delivery details
    @Override
    public void displayOrderDetails() {
        super.displayOrderDetails(); // Display shipping details
        System.out.println("Delivery Date: " + deliveryDate);
    }
}