package org.example.Search.LinearSearch;

import java.util.Scanner;

public class Maxin2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = {
                {56, 8, 9, 6},
                {98, 5, 32},
                {26, 112},
                {90, 54, 7, 2, 1}
        };

        System.out.println(search(arr));
    }

    static int search(int[][] arr ) {
        int max=Integer.MIN_VALUE;
        for(int rows = 0; rows < arr.length; rows++) {
            for (int cols = 0; cols < arr[rows].length; cols++) {
                if (arr[rows][cols] > max) {
                    max=arr[rows][cols];
                }
            }
        }
        return max;
    }
}
