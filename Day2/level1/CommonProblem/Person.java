import java.util.Scanner;

class Person{
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    Person(Person CopyPerson){
        this.name = CopyPerson.name;
        this.age = CopyPerson.age;
    }

    public void display(){
        System.out.println("Name of person : " + name );
        System.out.println("age : "+ age);
    }

}
class Main{
    public static void main(String[] args){


        // display name and age of Person
        Person person1 = new Person("Guru veer", 21);
        System.out.println("Name and age of Person  : ");
        person1.display();

        // display "name and age of Person using copy constructor
        Person person2 = new Person(person1);
        System.out.println("Name and age of Person using copy constructor : ");
        person2.display();
    }
}