package basicinheritance.employeemanagementsystem;

class Manager extends Employee  {
    int teamSize;
    // Constructor for Manager, calls parent constructor
    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Team size of Manager : "+ teamSize);
    }
}