// Define the Employee class
class Employee {
    public int employeeID;             // Public member
    protected String department;       // Protected member
    private double salary;             // Private member

    // Constructor to initialize employee details
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Method to modify salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method to display salary
    public double getSalary() {
        return salary;
    }
}

// Subclass Manager
class Manager extends Employee {
    private int teamSize;

    // Constructor to initialize Manager details
    public Manager(int employeeID, String department, double salary, int teamSize) {
        super(employeeID, department, salary);
        this.teamSize = teamSize;
    }

    // Method to display manager details
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeID); // Accessing public member
        System.out.println("Department: " + department);  // Accessing protected member
        System.out.println("Team Size: " + teamSize);
    }
}

// Main method
public class EmployeeRecords {
    public static void main(String[] args) {
        Manager manager = new Manager(98, "CSE", 750000.00, 6);
        manager.displayDetails();

        // Modify and access salary
        manager.setSalary(80000.00);
        System.out.println("Updated Salary: " + manager.getSalary());
    }
}
