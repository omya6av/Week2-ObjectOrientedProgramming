import java.util.Scanner;

// Create the Circle class
 class Circle {
    // Data variable for radius
    double radius;

    // Parameterized Constructor to initialize radius with user-provided value
    Circle(double radius) {
        this.radius = radius;
    }

    // Default Constructor using constructor chaining
    Circle() {
        this(10);  // Default radius set to 10 if no value is provided
    }

    // Method to display the radius
    public void displayRadius() {
        System.out.println("Radius: " + radius);
    }
}

class CircleDetails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for radius
        System.out.print("Enter radius for Circle 1: ");
        double radius = input.nextDouble();

        // Create Circle objects with user-provided and default radius
        Circle circle1 = new Circle(radius);  // Circle with user-provided radius
        Circle circle2 = new Circle();        // Circle with default radius

        // Display the radius of both circles
        System.out.println(" Circle 1 : ");
        circle1.displayRadius();
        System.out.println(" Circle 2 : ");
        circle2.displayRadius();
    }
}
