package org.example;

import java.util.Scanner;

public class NQT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = arr[0];
        int maxsum = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] >= arr[i - 1]) {
                sum += arr[i];
            } else {
                maxsum = Math.max(sum, maxsum);
                sum = arr[i];
            }
        }
        maxsum = Math.max(sum, maxsum); // Ensure final sum is checked
        System.out.println(maxsum);
    }
}
