// Main class
public class Overrides {
public static void main(String[] args) {
Animal a = new Animal();
a.sound(); // Calls parent class method
Dog d = new Dog();
d.sound(); // Calls child class overridden method
}
}
// Parent class
class Animal {
void sound() {
System.out.println("Animal makes a sound");
}
}
// Child class
class Dog extends Animal {
// Overriding the sound() method of parent class
void sound() {
System.out.println("Dog barks");
}
}
