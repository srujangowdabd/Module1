// Main class
public class TransportExample {
public static void main(String[] args) {
// Creating object of Bus
Bus bus = new Bus();
bus.move(); // inherited from Transport
bus.carryPassengers(); // Bus specific method
System.out.println();
// Creating object of Truck
Truck truck = new Truck();
truck.move(); // inherited from Transport
truck.carryGoods(); // Truck specific method
}
}
// Parent class
class Transport {
void move() {
System.out.println("Transport is moving");
}
}
// Child class 1
class Bus extends Transport {
void carryPassengers() {
System.out.println("Bus is carrying passengers");
}
}
// Child class 2
class Truck extends Transport {
void carryGoods() {
System.out.println("Truck is carrying goods");
}
}
