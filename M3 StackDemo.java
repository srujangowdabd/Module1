import java.util.Stack;
public class Stackdemo {
    public static void main(String[] args) {
        // 1. Create a Stack of Strings
        Stack<String> studentNames = new Stack<>();

        // 2. Push five student names
        studentNames.push("Alice");
        studentNames.push("Bob");
        studentNames.push("Charlie");
        studentNames.push("David");
        studentNames.push("Eve");
        
        System.out.println("Stack after pushing five names: " + studentNames);

        // 3. Pop one name
        if (!studentNames.isEmpty()) {
            String poppedName = studentNames.pop();
            System.out.println("\nPopped name: " + poppedName);
        } else {
            System.out.println("\nStack is empty, cannot pop.");
        }

        // 4. Display the resulting stack
        System.out.println("Resulting stack after popping one name: " + studentNames);
    }
}
    
