public class Recursive {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int result = productOfMainDiagonal(matrix, 0, 1);
        System.out.println("The product of the main diagonal is: " + result);
    }

    public static int productOfMainDiagonal(int[][] matrix, int index, int produs) {
        if (index >= matrix.length) {
            return produs;
        }

        // Multiply the diagonal element to the product so far
        produs *= matrix[index][index];

        // Recursive call
        return productOfMainDiagonal(matrix, index + 1, produs);
    }
}
