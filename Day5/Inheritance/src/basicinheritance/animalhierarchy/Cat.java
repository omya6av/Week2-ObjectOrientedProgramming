package basicinheritance.animalhierarchy;

class Cat extends Animal {

    // Constructor for Cat, calls parent constructor
    Cat(String name, int age) {
        super(name, age);
    }

    // Specific method for Cat's sound
    public void catSound() {
        System.out.println("Cat makes a sound");
    }
}
