package basicinheritance.animalhierarchy;


class Main{
    public static void main(String[] args) {

        // Creating an Animal object
        Animal animal = new Animal("WildAnimal", 15);
        animal.makeSound();
        animal.displayDetails();

        System.out.println("\nCALL from Dog class:");
        Dog dog = new Dog("Jack", 5);
        dog.dogSound();
        dog.makeSound();
        dog.displayDetails();

        System.out.println("\nCALL from Cat class:");
        Cat cat = new Cat("Koko", 4);
        cat.catSound();
        cat.makeSound();
        cat.displayDetails();

        System.out.println("\nCALL from Bird class:");
        Bird bird = new Bird("Huiii", 1);
        bird.birdSound();
        bird.makeSound();
        bird.displayDetails();
    }
}
