// Main class
public class MultipleInheritanceExample {
    public static void main(String[] args) {
        
        // Creating object of Dog class
        Dog d = new Dog();

        // Calling methods from both interfaces and Dog class
        d.eat();   // from Animal interface
        d.play();  // from Pet interface
        d.bark();  // from Dog class
    }
}

// First parent interface
interface Animal {
    void eat();   // method declaration only
}

// Second parent interface
interface Pet {
    void play();  // method declaration only
}

// Child class implementing multiple interfaces
class Dog implements Animal, Pet {

    // Overriding methods from Animal interface
    public void eat() {
        System.out.println("Dog can eat");
    }

    // Overriding methods from Pet interface
    public void play() {
        System.out.println("Dog loves to play");
    }

    // Own method of Dog class
    void bark() {
        System.out.println("Dog can bark");
    }
}
