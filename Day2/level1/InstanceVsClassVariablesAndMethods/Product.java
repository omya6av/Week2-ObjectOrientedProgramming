// Define the Product class
class Product {
    // Class variable to keep track of the total number of products
    static int totalProducts = 0;

    // Instance variables for each product's name and price
    String productName;
    double price;

    // Constructor to initialize instance variables and increment totalProducts
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    // Instance method to display details of the product
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }

    // Class method to display the total number of products
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

    // Main method for testing the Product class
    public static void main(String[] args) {
        // Create instances of the Product class
        Product product1 = new Product("HP-Laptop", 57000.00);
        Product product2 = new Product("Iphone-15", 65000.00);

        // Display details of individual products
        System.out.println("Details of Product 1:");
        product1.displayProductDetails();

        System.out.println("\nDetails of Product 2:");
        product2.displayProductDetails();

        // Display the total number of products create
        
        Product.displayTotalProducts();
    }
}
