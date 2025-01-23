 import java.util.ArrayList;
import java.util.List;

// Product Class
class Product {
     String name;
     double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

}

// Order Class
class Order {
     int orderId;
     Customer customer;
     List<Product> products;

    public Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public int getOrderId() {
        return orderId;
    }

    public List<Product> getProducts() {
        return products;
    }

    public double getTotalAmount() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customer.getName());
        System.out.println("Products:");
        for (Product product : products) {
            System.out.println("- " + product.getName());
        }
        System.out.println("Total Amount: INR" + getTotalAmount());
    }
}

// Customer Class
class Customer {
     String name;
     List<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void placeOrder(Order order) {
        orders.add(order);
    
    }

    public List<Order> getOrders() {
        return orders;
    }
}


public class ECommerceDetials{
    public static void main(String[] args) {
        // Create products
        Product product1 = new Product("Laptop", 4535);
        Product product2 = new Product("Headphones", 3555);
        Product product3 = new Product("Smartphone", 7777);

        // Create customer
        Customer customer1 = new Customer("Naman");

        // Create an order
        Order order1 = new Order(101, customer1);
        order1.addProduct(product1);
        order1.addProduct(product2);

        // Customer places the order
        customer1.placeOrder(order1);

        // Create another order 
        Order order2 = new Order(102, customer1);
        order2.addProduct(product3);

        // Customer places another order
        customer1.placeOrder(order2);

        // Display details of all orders placed by the customer
        System.out.println("Order Details for " + customer1.getName() + ":");
        for (Order order : customer1.getOrders()) {
            order.displayOrderDetails();
            System.out.println();
        }
    }
}