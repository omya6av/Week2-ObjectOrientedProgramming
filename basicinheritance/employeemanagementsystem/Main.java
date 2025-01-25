package basicinheritance.employeemanagementsystem;

class Main {

    public static void main(String[] args) {

        // Creating an Employee object
        Employee employee = new Employee("Purav jha ", 10, 219990 );
<<<<<<< HEAD
        System.out.println("Details of employees : ");
=======
        System.out.println("Details of employee : ");
>>>>>>> aad29cf0fd1d3a033002a89e8cf3a2515c5374c4
        employee.displayDetails();
        System.out.println();

        Manager manger = new Manager("Harsh Beniwal", 112, 501000, 15);
        System.out.println("Details of Manager : ");
        manger.displayDetails();
        System.out.println();

        Developer developer = new Developer("Om", 98, 101000, "Java" );
        System.out.println("Details of developer : ");
        developer.displayDetails();
        System.out.println();

        Intern intern = new Intern("naman", 82, 4900 );
        System.out.println("Details of intern : ");
        intern.displayDetails();

    }
}
