package org.example.PatternPrint;

public class NumberPattern {
    public static void main(String[] args) {
        int n = 5; // Change this to generate the pattern for any value of n

        // Create a 2D array to store the pattern
        int[][] pattern = new int[n][n];

        // Fill the pattern array
        int value = 1; // Start with value 1
        for (int diag = 0; diag < 2 * n - 1; diag++) {
            int startRow = diag < n ? 0 : diag - n + 1;
            int startCol = diag < n ? diag : n - 1;

            for (int row = startRow, col = startCol; row < n && col >= 0; row++, col--) {
                pattern[row][col] = value++;
            }
        }

        // Print the pattern
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(pattern[i][j] + " ");
            }
            System.out.println();
        }
    }
}
