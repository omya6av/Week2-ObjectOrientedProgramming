import java.sql.SQLOutput;
import java.util.ArrayList;

//Create Student class
class Student{
    String name;
    Student(String name){
        this.name = name;
    }
    public String getStudentName(){
        return name;
    }

}

//Create course class
class Course {

    String courseName;
    ArrayList<Student> students;

    //Constructor
    Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    //Add students to course
    public void addStudent(Student student) {
        students.add(student);
    }

    //Display courses
    public void displayCourse(Student s) {
        System.out.println(this.courseName);
    }
    public ArrayList<Student> getStudents(){
        return students;
    }
    public String getCoursename(){
        return courseName;
    }
}
//Create School class
class School {

    String schoolName;
    ArrayList<Course> courses;

    School(String schoolName) {
        this.schoolName = schoolName;
        this.courses = new ArrayList<>();
    }

    //Add courses to school
    public void addCourse(Course course) {
        courses.add(course);
    }
    //Return courses
    public ArrayList<Course> getCourses(){
        return courses;
    }




}


class Main {
    public static void main(String[] args) {

        //Create school object
        School s1 = new School("Imperial public school");

        //Create Course object
        Course c1 =new Course("Computer Science");
        Course c2 =new Course("Mathematics 2");

        //Add courses to school
        s1.addCourse(c1);
        s1.addCourse(c2);

        //Create student object
        Student s01 = new Student("Mbappe");
        Student s2 = new Student("Neymar");
        Student s3= new Student("Messi");
        Student s4 = new Student("Ronaldo");

        //Add student to courses
        c1.addStudent(s01);
        c1.addStudent(s2);
        c2.addStudent(s3);
        c2.addStudent(s4);

        //Display company details
        System.out.println("School Name : "+s1.schoolName);

        for(Course c : s1.getCourses()){
            System.out.println("Course : "+c.getCoursename());
            for(Student s : c.getStudents()){
                System.out.println("Student : "+s.getStudentName());
            }
        }
    }
}