class Employee {

    // Properties
    private int salary;
    private String name;

    // Method to return salary
    public int getSalary() {
        return salary;
    }

    // Method to return name
    public String getName() {
        return name;
    }

    // Method to set/change name
    public void setName(String newName) {
        name = newName;
    }

    // Optional: Constructor to set initial values
    public Employee(int salary, String name) {
        this.salary = salary;
        this.name = name;
    }
}
