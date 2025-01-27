package encapsulation.employeemanagement;

abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;
    private double finalSalary;

    //Constructor
    Employee(int employeeId,String name,double baseSalary){
        this.employeeId =employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Abstract method
    abstract double calculateSalary();

    //Concrete method

    public void displayDetails(){
        System.out.println("Employee id :"+employeeId);
        System.out.println("Name :"+name);
        System.out.println("Base Salary :"+baseSalary);

    }



    //Getter for Employee id
    public int getId(){
        return employeeId;
    }
    //Getter for Employee name
    public String getName(){
        return name;
    }
    //Getter for base salary
    public double getSalary(){
        return baseSalary;
    }

}