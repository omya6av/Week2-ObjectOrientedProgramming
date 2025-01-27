package encapsulation.employeemanagement;

// Part-time employee class
class PartTimeEmployee extends Employee implements Department {
    private double hoursWorked;
    private double hourlyRate;

    private String department;

    PartTimeEmployee(int employeeId, String name, double baseSalary, double hoursWorked, double hourlyRate) {
        super(employeeId, name, baseSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    //Calculate salary
    public double calculateSalary() {
        return getSalary() + (hourlyRate * hoursWorked);
    }

    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }


    public String getDepartmentDetails() {
        return department;
    }

}