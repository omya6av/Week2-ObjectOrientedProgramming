import java.util.ArrayList;
import java.util.List;

// Professor Class
class Professor {
    private String name;

    public Professor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}

// Student Class
class Student {
    private String name;
    private List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollCourse(Course course) {
        courses.add(course);
        course.enrollStudent(this);
    }

    public void displayStudentDetails() {
        System.out.println("Student: " + name);
        System.out.println("Enrolled Courses:");
        if (courses.isEmpty()) {
            System.out.println("No courses enrolled yet.");
        } else {
            for (Course course : courses) {
                System.out.println("- " + course.getName());
            }
        }
        System.out.println();
    }
}

// Course Class
class Course {
    String name;
    Professor professor;
    List<Student> students;

    Course(String name) {
        this.name = name;
        this.professor = null;
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
        System.out.println(professor.getName() + " has been assigned to teach " + name + ".");
    }

    public void enrollStudent(Student student) {
        students.add(student);
        System.out.println(student.getName() + " has enrolled in " + name + ".");
    }

    public List<Student> getStudents() {
        return students;
    }

    public void displayCourseDetails() {
        System.out.println("Course: " + name);
        System.out.println("Professor: " + (professor != null ? professor.getName() : "Not assigned yet"));
        System.out.println("Enrolled Students: ");
        if (students.isEmpty()) {
            System.out.println("No students enrolled yet.");
        } else {
            for (Student student : students) {
                System.out.println("- " + student.getName());
            }
        }
        System.out.println();
    }
}


class UniversityManagementSystem {
    public static void main(String[] args) {
        // Create professors
        Professor professor1 = new Professor("Sir manoj");
        Professor professor2 = new Professor("Sir vivek");

        // Create courses
        Course course1 = new Course("Mathematics");
        Course course2 = new Course("Computer Science");
        Course course3 = new Course("Physics");

        // Assign professors to courses
        course1.assignProfessor(professor1);
        course2.assignProfessor(professor2);
        course3.assignProfessor(professor1);

        // Create students
        Student student1 = new Student("Aman");
        Student student2 = new Student("Vikesh");
        Student student3 = new Student("Ishu");

        // Students enroll in courses
        student1.enrollCourse(course1);
        student1.enrollCourse(course2);
        student2.enrollCourse(course1);
        student3.enrollCourse(course3);

        // Display details of students and their enrolled courses
        student1.displayStudentDetails();
        student2.displayStudentDetails();
        student3.displayStudentDetails();

        // Display details of courses, professors, and enrolled students
        course1.displayCourseDetails();
        course2.displayCourseDetails();
        course3.displayCourseDetails();
    }
}