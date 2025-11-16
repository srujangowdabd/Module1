class Animal {
    void eat() {
        System.out.println("Animals can eat");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog can bark");
    }
}

public class SingleInheritanceExample {
    public static void main(String[] args) {
        // Create object of subclass
        Dog d = new Dog();

        // Child can access both parent and child methods
        d.eat();  // inherited from Animal
        d.bark(); // method of Dog
    }
}
