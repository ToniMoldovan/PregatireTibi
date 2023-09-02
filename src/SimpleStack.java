public class SimpleStack {
    private int maxSize;  // Max size of the stack
    private int top;  // Top of the stack
    private int[] stackArray;  // The array to store stack elements

    public SimpleStack(int size) {
        maxSize = size;
        top = -1;  // Initialize top to -1 as the stack is empty
        stackArray = new int[maxSize];
    }

    // Method to push an element onto the stack
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + value);
            return;
        }
        stackArray[++top] = value;
    }

    // Method to pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        }
        return stackArray[top--];
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }

    // Check if the stack is full
    public boolean isFull() {
        return (top == maxSize - 1);
    }

    // Method to display the stack
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SimpleStack stack = new SimpleStack(5);

        // Push some elements
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Display the stack
        stack.display();

        // Pop an element
        System.out.println("Popped: " + stack.pop());

        // Display the stack again
        stack.display();
    }
}
