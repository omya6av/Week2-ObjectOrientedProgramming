package basicinheritance.employeemanagementsystem;

class Employee {

    String name;
    int id;
    double salary;

    // Constructor to initialize name, salary and id
    Employee(String name, int id,double salary) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    // Method to display Employee details
    public void displayDetails() {
        System.out.println("Name: " + name + ", id: " + id + ", Salary : "+  salary);
    }
}