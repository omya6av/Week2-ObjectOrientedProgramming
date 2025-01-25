package multilevelInheritance.retailordermanagement;

class Order {
    String orderId;
    String orderDate;

    // Constructor to initialize Order details
    Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Method to get order status
    public String getOrderStatus() {
        return "Order placed";
    }

    // Method to display basic order details
    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
    }
}