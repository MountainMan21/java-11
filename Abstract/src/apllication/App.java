package apllication;

class Animal {
    String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Method
    public void makeSound() {
        System.out.println("Some generic sound");
    }
}

// The subclass or derived class
class Dog extends Animal {
    // Additional attributes specific to Dog
    String breed;

    // Constructor
    public Dog(String name, String breed) {
        // Call the constructor of the superclass
        super(name);
        this.breed = breed;
    }

    // Overriding the makeSound method
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }

    // Additional method specific to Dog
    public void fetch() {
        System.out.println("Fetching the ball");
    }
}

public class App {
    public static void main(String[] args) {
        // Create an instance of the subclass
        Dog myDog = new Dog("Buddy", "Labrador");

        // Access attributes and methods from both the superclass and subclass
        System.out.println("Name: " + myDog.name);
        System.out.println("Breed: " + myDog.breed);

        // Call methods
        myDog.makeSound(); // Calls the overridden method in Dog class
        myDog.fetch();     // Calls the method specific to Dog class
    }
}