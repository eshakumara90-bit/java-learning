public class Stack {
    private static final int MAX_SIZE = 10;
    private int[] stackArray;
    private int top;

    // Constructor
    public Stack() {
        stackArray = new int[MAX_SIZE];
        top = -1;  // IMPORTANT: Initialization
    }

    // Method to push an element onto the stack
    public void push(int element) {
        if (top < MAX_SIZE - 1) {
            stackArray[++top] = element;
            System.out.println("Pushed: " + element);
        } else {
            System.out.println("Stack Overflow! Cannot push " + element);
        }
    }

    // Method to pop an element from the stack
    public void pop() {
        if (top >= 0) {
            int poppedElement = stackArray[top--];
            System.out.println("Popped: " + poppedElement);
        } else {
            System.out.println("Stack Underflow! Cannot pop from an empty stack.");
        }
    }

    // Method to display elements in the stack
    public void display() {
        if (top >= 0) {
            System.out.println("Elements in the Stack:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stackArray[i]);
            }
        } else {
            System.out.println("Stack is empty.");
        }
    }

    // Main method
    public static void main(String[] args) {
        // Create a stack
        Stack myStack = new Stack();

        // Perform stack operations
        myStack.push(5);
        myStack.push(10);
        myStack.push(20);
        myStack.display();

        myStack.pop();
        myStack.display();

        myStack.push(15);
        myStack.push(25);
        myStack.push(30);
        myStack.display();

        myStack.pop();
        myStack.pop();
        myStack.display();
    }
}
