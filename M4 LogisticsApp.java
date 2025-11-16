public class LogisticsApp {
public static void main(String[] args) {
Transport t; // Parent reference
t = new Truck();
t.deliver(); // Output: Truck is delivering goods
t = new Ship();
t.deliver(); // Output: Ship is delivering goods
t = new Airplane();
t.deliver(); // Output: Airplane is delivering goods
}
}
// Base class
class Transport {
void deliver() {
System.out.println("Transport is delivering goods");
}
}
// Subclass 1
class Truck extends Transport {
void deliver() {
System.out.println("Truck is delivering goods");
}
}
// Subclass 2
class Ship extends Transport {
void deliver() {
System.out.println("Ship is delivering goods");
}
}
// Subclass 3
class Airplane extends Transport {
void deliver() {
System.out.println("Airplane is delivering goods");
}
}
