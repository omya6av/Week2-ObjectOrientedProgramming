// Define the Course class
class Course {
    // Class variable for the institute name (shared across all courses)
    static String instituteName = "Techno-cards Gaming Institute";

    // Instance variables for course name, duration, and fee
    String courseName;
    int duration; // Duration in hours, weeks, or months
    double fee;

    // Constructor to initialize instance variables
    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display details of the course
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: " + fee);
        System.out.println("Institute Name: " + instituteName);
    }

    // Class method to update the institute name
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }

    // Main method for testing the Course class
    public static void main(String[] args) {
        // Create instances of the Course class
        Course course1 = new Course("Java Programming", 8, 3000.00);
        Course course2 = new Course("Web Development", 12, 5000.00);

        // Display details of individual courses
        System.out.println("Details of Course 1:");
        course1.displayCourseDetails();

        System.out.println("\nDetails of Course 2:");
        course2.displayCourseDetails();

        // Update the institute name
        Course.updateInstituteName("TechnoLearn Institute");

        // Display details again to reflect the updated institute name
        System.out.println("\nAfter Updating Institute Name:");
        course1.displayCourseDetails();
        course2.displayCourseDetails();
    }
}
