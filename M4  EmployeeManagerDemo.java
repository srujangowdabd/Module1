public class EmployeeManagerDemo {
    public static void main(String[] args) {
        
        // Creating object of Manager (child class)
        Manager m = new Manager("Ravi Kumar", 55000, "HR");

        // Calling method to display complete details
        m.displayInfo();
    }
}

// Parent class
class Employee {
    String name;
    double salary;

    // Constructor
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee info
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: ₹" + salary);
    }
}

// Child class
class Manager extends Employee {
    String department;

    // Constructor
    Manager(String name, double salary, String department) {
        super(name, salary);  // calling parent constructor
        this.department = department;
    }

    // Overriding displayInfo to show department also
    void displayInfo() {
        super.displayInfo(); // print name & salary
        System.out.println("Department: " + department);
    }
}
