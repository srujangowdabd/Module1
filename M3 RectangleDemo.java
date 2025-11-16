class Rectangle {
    private int length;
    private int breadth;

    // Default constructor (given values)
    Rectangle() {
        length = 4;
        breadth = 5;
    }

    // Parameterized constructor (custom values)
    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    int getArea() {
        return length * breadth;
    }

    void display() {
        System.out.println("Length: " + length + ", Breadth: " + breadth);
        System.out.println("Area: " + getArea());
    }
}

public class RectangleDemo {
    public static void main(String[] args) {
        // Using default constructor
        Rectangle r1 = new Rectangle();
        System.out.println("Rectangle 1 (Default):");
        r1.display();

        // Using parameterized constructor
        Rectangle r2 = new Rectangle(10, 20);
        System.out.println("\nRectangle 2 (Custom):");
        r2.display();
    }
}
