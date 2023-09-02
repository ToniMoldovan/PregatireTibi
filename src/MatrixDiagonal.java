public class MatrixDiagonal {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int n = matrix.length;  // Assuming it's a square matrix
        int sum = 0;

        // Print the main diagonal
        System.out.println("Main diagonal:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.print("Index: [" + i + "], [" + j + "] ");
                    System.out.print(matrix[i][j] + " ");
                    System.out.println();

                    sum += matrix[i][j];
                }
            }
        }

        System.out.println("Secondary diagonal:");
        sum = 0;
        // Print the secondary diagonal
        for (int i = 0; i < n; i++) {
            System.out.print("Index: [" + i + "], [" + (n - i - 1) + "] ");
            System.out.print(matrix[i][n - i - 1] + " ");
            System.out.println();

            sum += matrix[i][n - i - 1];
        }

        System.out.println("Sum of main diagonal: " + sum);
        System.out.println("Sum of second diagonal: " + sum);
    }
}
