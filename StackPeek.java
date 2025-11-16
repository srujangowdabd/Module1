import java.util.Stack;

public class StackPeekExercise {
    public static void main(String[] args) {
        // Create a Stack of Integers
        Stack<Integer> numberStack = new Stack<>();

        // Push numbers 1 through 5
        numberStack.push(1);
        numberStack.push(2);
        numberStack.push(3);
        numberStack.push(4);
        numberStack.push(5);

        System.out.println("Stack after pushing 1-5: " + numberStack);

        // Display the top element using peek()
        if (!numberStack.isEmpty()) {
            int topElement = numberStack.peek();
            System.out.println("\nTop element using peek(): " + topElement);
            // The stack remains unchanged after peek()
            System.out.println("Stack after peek(): " + numberStack);
        } else {
            System.out.println("\nStack is empty.");
        }
    }
}
