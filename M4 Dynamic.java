public class Dynamic {
    public static void main(String[] args) {

        Animal a = new Animal();   // reference of parent class with parent object
        a.sound();                 // Output: Animal makes a sound

        a = new Dog();             // reference of parent, object of Dog
        a.sound();                 // Output: Bark

        a = new Cat();             // reference of parent, object of Cat
        a.sound();                 // Output: Meow
    }
}

// Parent class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class 1
class Dog extends Animal {
    void sound() {
        System.out.println("Bark");
    }
}

// Child class 2
class Cat extends Animal {
    void sound() {
        System.out.println("Meow");
    }
}
