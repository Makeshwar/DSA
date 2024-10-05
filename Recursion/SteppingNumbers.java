package org.example.Recursion;

public class SteppingNumbers {

    public static void printSteppingNumbers(int start, int end) {

        // Generate stepping numbers for each digit from 1 to 9
        for (int i = 1; i <= 9; i++) {
            dfs(i, start, end); // Start DFS from each digit
        }
    }

    // Depth-First Search function to find stepping numbers
    public static void dfs(int num, int start, int end) {
        // Base case: if the current number exceeds the upper limit
        if (num > end) {
            return;
        }

        // Print the number if it is within the given range
        if (num >= start && num <= end) {
            System.out.print(num + " ");
        }

        // Get the last digit of the current number
        int lastDigit = num % 10;

        // Generate the next possible stepping numbers
        if (lastDigit > 0) {
            dfs(num * 10 + (lastDigit - 1), start, end); // Append (lastDigit - 1)
        }
        if (lastDigit < 9) {
            dfs(num * 10 + (lastDigit + 1), start, end); // Append (lastDigit + 1)
        }
    }

    public static void main(String[] args) {
        int start = 1000, end = 1500; // Example range
        printSteppingNumbers(start, end);
    }
}