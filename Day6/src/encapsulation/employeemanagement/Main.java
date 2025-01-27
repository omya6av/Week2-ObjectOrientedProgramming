package encapsulation.employeemanagement;
import java.util.ArrayList;
import java.util.List;


// Main class
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Create list for Employees
        List<Employee> employees= new ArrayList<>();

        //create FullTimeEmployee and PartTimeEmployee object
        FullTimeEmployee fte = new FullTimeEmployee(101,"John Cena",25000,10000);
        PartTimeEmployee pte = new PartTimeEmployee(202,"Mark Wood",12000,5,1000
        );

        //Set department
        fte.assignDepartment("IT");
        pte.assignDepartment("Computer Science");

        //Display Details
        fte.displayDetails();
        pte.displayDetails();

    }
}
