10. Create a Student class and display student info
class Student {
    String name;
    int rollNo;

    void setData(String n, int r) {
        name = n;
        rollNo = r;
    }

    void display() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setData("Rahul", 101);
        s1.display();
    }
}

import java.util.Scanner;
class Student {
    String name;
    int rollNo;
    void setData(String n, int r) {
        name = n;
        rollNo = r;
    }
    void display() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo);
    }
}
public class StudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take input from user
        System.out.print("Enter student name: ");
        String name = sc.nextLine();   // Reads a line of text
        System.out.print("Enter roll number: ");
        int rollNo = sc.nextInt();     // Reads an integer
        // Create object and set data
        Student s1 = new Student();
        s1.setData(name, rollNo);
        // Display details
        s1.display();
        sc.close();
    }
}
