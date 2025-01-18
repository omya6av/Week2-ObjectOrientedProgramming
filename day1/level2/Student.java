import java.util.*; 
// Class to represent a Student
class Student {

    // Instance variables to store student's details
    String name;     
    int rollNumber; 
    int marks;       

    // Constructor to initialize the student object
    Student(String name, int rollNumber, int marks) {
        this.name = name;            
        this.rollNumber = rollNumber;  
        this.marks = marks;            
    }

    // Method to calculate the grade based on marks
    public String grade() {
        if (marks > 89) return "A+";
        else if (marks < 90 && marks > 79) return "A";
        else if (marks < 80 && marks > 69) return "B+";
        else if (marks < 70 && marks > 59) return "B";
        else if (marks < 60 && marks > 49) return "C+";
        else if (marks < 50 && marks > 32) return "C";
        else return "Fail"; 
    }

    // Method to display student details and grade
    public void display() {
        System.out.println("Name of Student is: " + name +
                ", \nRoll Number of Student: " + rollNumber +
                ", \nMarks of Student: " + marks +
                " And grade is: " + grade());
    }
}

// Main class to run the program
class Main {
    public static void main(String[] args) {

        // Creating an object of Student and initializing it with details
        Student student1 = new Student("OM Yadav", 98, 87);

        // Displaying the details of the student
        student1.display();
    }
}
