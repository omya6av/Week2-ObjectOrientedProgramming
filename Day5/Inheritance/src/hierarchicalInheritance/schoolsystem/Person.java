package hierarchicalInheritance.schoolsystem;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayRole() {
        System.out.println("This is a person.");
    }
}
