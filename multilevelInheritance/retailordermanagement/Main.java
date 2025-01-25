package multilevelInheritance.retailordermanagement;

// Main class to demonstrate multilevel inheritance
 class OrderManagement {
    public static void main(String[] args) {
        // Create an Order object
        Order order = new Order("ORD123", "2025-01-20");
        System.out.println("Base Class: Order");
        order.displayOrderDetails();
        System.out.println("Status: " + order.getOrderStatus());
        System.out.println();

        // Create a ShippedOrder object
        ShippedOrder shippedOrder = new ShippedOrder("ORD124", "2025-01-21", "TRACK456");
        System.out.println("Subclass: ShippedOrder");
        shippedOrder.displayOrderDetails();
        System.out.println("Status: " + shippedOrder.getOrderStatus());
        System.out.println();

        // Create a DeliveredOrder object
        DeliveredOrder deliveredOrder = new DeliveredOrder("ORD125", "2025-01-22", "TRACK789", "2025-01-23");
        System.out.println("Subclass: DeliveredOrder");
        deliveredOrder.displayOrderDetails();
        System.out.println("Status: " + deliveredOrder.getOrderStatus());
    }
}

