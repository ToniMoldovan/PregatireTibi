// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 5, 6, 7, 8, 9, 0};

        int firstSmallestNumber = array[0], secondSmallestNumber = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < firstSmallestNumber) {
                secondSmallestNumber = firstSmallestNumber;
                firstSmallestNumber = array[i];
            } else if (array[i] < secondSmallestNumber) {
                secondSmallestNumber = array[i];
            }
        }

        System.out.println("First smallest number: " + firstSmallestNumber);
        System.out.println("Second smallest number: " + secondSmallestNumber);

    }
}