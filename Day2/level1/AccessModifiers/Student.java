// Define the Student class
class Student {
    public int rollNumber;         // Public member
    protected String name;         // Protected member
    private double CGPA;           // Private member

    // Constructor to initialize the student details
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public methods to access and modify CGPA
    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }
}

// Subclass PostgraduateStudent
class PostgraduateStudent extends Student {
    private String specialization;

    // Constructor to initialize the PostgraduateStudent details
    public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    // Method to display postgraduate student details
    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name); // Accessing protected member
        System.out.println("Specialization: " + specialization);
    }
}

// Main method
public class UniversityManagement {
    public static void main(String[] args) {
        PostgraduateStudent student = new PostgraduateStudent(98, "OMI", 8.06, "Data Science");
        student.displayDetails();

        // Modify and access CGPA
        student.setCGPA(9.5);
        System.out.println("Updated CGPA: " + student.getCGPA());
    }
}
