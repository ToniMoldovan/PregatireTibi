public class SimpleArray {
    private int[] array;
    private int size;
    private int capacity;

    public SimpleArray(int capacity) {
        this.capacity = capacity;
        this.array = new int[capacity];
        this.size = 0;
    }

    // Add element at the end
    public void add(int value) {
        if (size >= capacity) {
            System.out.println("Array is full. Cannot add " + value);
            return;
        }
        array[size++] = value;
    }

    // Add element at a specific index
    public void addAtIndex(int index, int value) {
        if (size >= capacity) {
            System.out.println("Array is full. Cannot add " + value);
            return;
        }
        if (index > size || index < 0) {
            System.out.println("Index out of bounds");
            return;
        }

        // Shift elements to the right to make space
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }

        array[index] = value;
        size++;
    }

    // Delete element at a specific index
    public void deleteAtIndex(int index) {
        if (size == 0) {
            System.out.println("Array is empty. Cannot delete.");
            return;
        }
        if (index >= size || index < 0) {
            System.out.println("Index out of bounds");
            return;
        }

        // Shift elements to the left to fill the gap
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }

        size--;
    }

    // Display the array
    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SimpleArray arr = new SimpleArray(10);

        // Add elements
        arr.add(1);
        arr.add(2);
        arr.add(3);

        // Display array
        arr.display();

        // Add element at index 1
        arr.addAtIndex(1, 4);

        // Display array
        arr.display();

        // Delete element at index 2
        arr.deleteAtIndex(2);

        // Display array
        arr.display();
    }
}
