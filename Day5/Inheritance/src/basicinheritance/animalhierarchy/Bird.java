package basicinheritance.animalhierarchy;

class Bird extends Animal {

    // Constructor for Bird, calls parent constructor
    Bird(String name, int age) {
        super(name, age);
    }

    // Specific method for Bird's sound
    public void birdSound() {
        System.out.println("Bird makes a sound");
    }
}