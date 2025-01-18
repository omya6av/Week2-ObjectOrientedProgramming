// Employee.java
public class Employee {

    String employeeName;
    int employeeId;
    int employeeSalary;

    // Constructor
  public   Employee(String employeeName, int employeeId, int employeeSalary) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.employeeSalary = employeeSalary;
    }

    // Method to display employee details
    public void employeeDetail() {
        System.out.println("Name of employee is: " + employeeName +
                ", id: " + employeeId +
                ", and salary is: " + employeeSalary);
    }
}

// Main.java
class Main {
    public static void main(String[] args) {

        // Creating Employee objects
        Employee employee1 = new Employee("Om Yadav", 98, 300000);
        Employee employee2 = new Employee("Naman", 82, 100000);

        // Displaying details
        employee1.employeeDetail();
        employee2.employeeDetail();
    }
}
