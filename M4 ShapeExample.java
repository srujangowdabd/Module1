// Main class
public class ShapeExample {
public static void main(String[] args) {
// Creating objects of subclasses
Circle c = new Circle();
Rectangle r = new Rectangle();
// Calling methods
c.displayShape();
c.area();
r.displayShape();
r.area();
}
}
// Parent class
class Shape {
void displayShape() {
System.out.println("This is a shape");
}
}
// Child class 1
class Circle extends Shape {
void area() {
double radius = 5;
double area = 3.14 * radius * radius;
System.out.println("Area of Circle: " +
area);
}
}
// Child class 2
class Rectangle extends Shape {
void area() {
double length = 6;
double width = 4;
double area = length * width;
System.out.println("Area of Rectangle: " +
area);
}
}
