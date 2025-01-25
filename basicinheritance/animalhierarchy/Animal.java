package basicinheritance.animalhierarchy;

class Animal{

    String name; // Animal's name
    int age;     // Animal's age

    // Constructor to initialize name and age
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Generic method to make a sound
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }

    // Method to display animal details
    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}