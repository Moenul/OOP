package Abstraction;

// Abstract class
abstract class Animal {
    // Abstract method (no implementation)
    abstract void makeSound(String name);

    // Concrete method (implementation provided)
    void sleep() {
        System.out.println("Sleeping...");
    }
}

// Subclass 1
class Dog extends Animal {
    @Override
    void makeSound(String name) {
        System.out.println( name + " Woof! Woof!");
    }
}

// Subclass 2
class Cat extends Animal {
    @Override
    void makeSound(String name) {
        System.out.println(name + " Meow! Meow!");
    }
}

public class Main {
    public static void main(String[] args) {
        // Abstract type reference, concrete object
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Call methods
        myDog.makeSound("Doggy"); // Woof! Woof!
        myCat.makeSound("Tommy"); // Meow! Meow!
        myDog.sleep();     // Sleeping...
    }
}
