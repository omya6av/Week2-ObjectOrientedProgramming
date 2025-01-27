package encapsulation.employeemanagement;

// Full-time employee class
class FullTimeEmployee extends Employee implements Department {
    private double bonus;
    private String department;

    FullTimeEmployee(int employeeId, String name, double baseSalary, double bonus) {
        super(employeeId, name, baseSalary);
        this.bonus = bonus;
    }

    //Calculate salary
    public double calculateSalary() {
        return getSalary() + bonus;
    }


    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }


    public String getDepartmentDetails() {
        return department;
    }

}

