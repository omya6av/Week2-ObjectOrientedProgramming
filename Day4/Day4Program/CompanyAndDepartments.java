import java.util.ArrayList;
import java.util.List;

// Employee Class
class Employee {
     String name;

    // Constructor
    public Employee(String name) {
        this.name = name;
    }

    // toString Method for Display
    @Override
    public String toString() {
        return "Employee{name = '" + name + "' }";
    }
}

// Department Class
class Department {
     String name;
     List<Employee> employees; // Composition: Department has Employees

    // Constructor
    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    // Add Employee to Department
    public void addEmployee(String employeeName) {
        employees.add(new Employee(employeeName));
    }

    // Display Employees
    public void displayEmployees() {
        System.out.println("Employees in Department: " + name);
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    // toString Method for Display
    @Override
    public String toString() {
        return "Department { name = '" + name + "', employees = " + employees + " }";
    }
}

// Company Class
class Company {
     String name;
     List<Department> departments; // Composition: Company has Departments

    // Constructor
    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    // Add Department to Company
    public void addDepartment(String departmentName) {
        departments.add(new Department(departmentName));
    }

    // Add Employee to a Specific Department
    public void addEmployeeToDepartment(String departmentName, String employeeName) {
        for (Department department : departments) {
            if (departmentName.equals(department.name)) {
                department.addEmployee(employeeName);
                return;
            }
        }
        System.out.println("Department not found: " + departmentName);
    }

    // Display All Departments and Employees
    public void displayDepartments() {
        System.out.println("Company: " + name);
        for (Department department : departments) {
            department.displayEmployees();
        }
    }

    // Delete Company (Simulates Deletion)
    public void deleteCompany() {
        System.out.println("Deleting company: " + name);
        departments.clear(); // Deleting all departments (and their employees)
    }
}

// Main Class to Test Composition
 class CompanyCompositionExample {
    public static void main(String[] args) {
        // Create Company
        Company company = new Company("omegle");

        // Add Departments

        company.addDepartment("IT");
        company.addDepartment("BM");

        // Add Employees to Departments
        company.addEmployeeToDepartment("IT", "OMI");
        company.addEmployeeToDepartment("IT", "Oliviya");
        company.addEmployeeToDepartment("BM", "Vikesh");

        // Display Departments and Employees
        company.displayDepartments();

        // Delete Company
        company.deleteCompany();
    }
}
