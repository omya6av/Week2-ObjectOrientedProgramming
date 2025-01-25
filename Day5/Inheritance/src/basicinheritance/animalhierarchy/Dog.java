package basicinheritance.animalhierarchy;


class Dog extends Animal {

    // Constructor for Dog, calls parent constructor
    Dog(String name, int age) {
        super(name, age);
    }

    // Specific method for Dog's sound
    public void dogSound() {
        System.out.println("Dog makes a sound");
    }
}
