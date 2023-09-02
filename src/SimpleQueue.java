public class SimpleQueue {
    private int maxSize;
    private int front;
    private int rear;
    private int[] queueArray;

    public SimpleQueue(int size) {
        maxSize = size;
        front = 0;
        rear = -1;
        queueArray = new int[maxSize];
    }

    // Method to add an element at the end of the queue
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + value);
            return;
        }
        queueArray[++rear] = value;
    }

    // Method to remove an element from the front of the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }

        int temp = queueArray[front];
        // Shift all the elements down by one
        for (int i = 0; i < rear; i++) {
            queueArray[i] = queueArray[i + 1];
        }
        rear--;  // Reduce the rear index
        return temp;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return (rear < front);
    }

    // Check if the queue is full
    public boolean isFull() {
        return (rear == maxSize - 1);
    }

    // Method to display the queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.print(queueArray[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SimpleQueue q = new SimpleQueue(5);

        // Enqueue some elements
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        // Display the queue
        q.display();

        // Dequeue an element
        System.out.println("Dequeued: " + q.dequeue());

        // Display the queue again
        q.display();

        System.out.println("Peek: " + q.queueArray[q.rear]);
    }
}
