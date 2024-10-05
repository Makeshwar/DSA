package org.example.Strings;

public class SumofDigits {
    public int getLucky(String s, int k) {
        int sum = 0;

        // First transformation: Convert characters to numeric value based on their position in the alphabet
        for (char c : s.toCharArray()) {
            int num = c - 'a' + 1;  // 'a' = 1, 'b' = 2, ..., 'z' = 26
            // Add the digits of the number
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
        }

        // Perform k-1 further transformations on the resulting sum
        for (int i = 1; i < k; i++) {
            int newSum = 0;
            while (sum > 0) {
                newSum += sum % 10;
                sum /= 10;
            }
            sum = newSum;  // Update sum for the next iteration
        }

        return sum;
    }

    public static void main(String[] args) {
        SumofDigits sod=new SumofDigits();
        System.out.println(sod.getLucky("iiii",2));
    }
}
