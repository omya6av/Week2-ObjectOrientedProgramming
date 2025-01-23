import java.util.ArrayList;
import java.util.List;

// Faculty Class
class Faculty {
     String name;

     Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}

// Department Class
class Department {
     String name;
     ArrayList<Faculty> faculties;

    public Department(String name) {
        this.name = name;
        this.faculties = new ArrayList<>();
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public String getName() {
        return name;
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }



    // Delete
    public void deleteDepartment() {
        faculties.clear();
        System.out.println("Department '" + name + "' is being deleted.");
    }
}

// University Class
class University {
     String name;
    private List<Department> departments;

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public String getName() {
        return name;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    //Deleting university 
    public void deleteUniversity() {
        for (Department department : departments) {
            department.deleteDepartment();
        }
        departments.clear();
        System.out.println("University '" + name + "' is deleted.");
    }


}

public class FacultyDetail {
    public static void main(String[] args) {
        // Create Faculty object
        Faculty faculty1 = new Faculty("Dr Manoj");
        Faculty faculty2 = new Faculty("Dr Ashish");
        Faculty faculty3 = new Faculty("Dr vivek");

        // Create Department object
        Department d1 = new Department("Computer Science");
        Department d2 = new Department("Mathematics");

        // Add faculty members to departments
        d1.addFaculty(faculty1);
        d1.addFaculty(faculty2);
        d2.addFaculty(faculty3);

        // Create University
        University university = new University("RGPV University");

        // Add departments to the university
        university.addDepartment(d1);
        university.addDepartment(d2);

        // Print university details
        System.out.println(university.getName());

        // Delete
        university.deleteUniversity();

        //Faculty can exist outside of a department
        System.out.println(faculty1.getName());
    }
}