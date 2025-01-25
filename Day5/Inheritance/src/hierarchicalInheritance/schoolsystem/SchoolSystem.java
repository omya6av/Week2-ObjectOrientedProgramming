package hierarchicalInheritance.schoolsystem;


public class SchoolSystem {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Mr. Smith", 30, "Mathematics");
        Student student = new Student("Alice", 16, 10);
        Staff staff = new Staff("Mrs. Johnson", 45, "Administration");

        teacher.displayRole();
        student.displayRole();
        staff.displayRole();
    }
}