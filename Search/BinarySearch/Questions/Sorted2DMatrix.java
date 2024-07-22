package org.example.Search.BinarySearch.Questions;

import java.util.Arrays;
import java.util.Scanner;

public class Sorted2DMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int target = sc.nextInt();
        System.out.println(Arrays.toString(sorted2D(arr, target)));
    }

    static int[] binarysearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            }
            if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    static int[] sorted2D(int[][] arr, int target) {
        int rows = arr.length;
        int cols = arr[0].length;

        if (rows == 1) {
            return binarysearch(arr, 0, 0, cols - 1, target);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        // Binary search on the middle column
        while (rStart < (rEnd - 1)) { // while this is true, matrix has more than two rows
            int mid = rStart + (rEnd - rStart) / 2;
            if (arr[mid][cMid] == target) {
                return new int[]{mid, cMid};
            }
            if (arr[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }

        // Now we have two rows remaining
        // Check if target is in the middle column of any of the two rows
        if (arr[rStart][cMid] == target) {
            return new int[]{rStart, cMid};
        }
        if (arr[rStart + 1][cMid] == target) {
            return new int[]{rStart + 1, cMid};
        }

        // Search in 1st half of rStart
        if (target <= arr[rStart][cMid - 1]) {
            return binarysearch(arr, rStart, 0, cMid - 1, target);
        }
        // Search in 2nd half of rStart
        if (target >= arr[rStart][cMid + 1] && target <= arr[rStart][cols - 1]) {
            return binarysearch(arr, rStart, cMid + 1, cols - 1, target);
        }
        // Search in 1st half of rStart+1
        if (target <= arr[rStart + 1][cMid - 1]) {
            return binarysearch(arr, rStart + 1, 0, cMid - 1, target);
        } else {
            // Search in 2nd half of rStart+1
            return binarysearch(arr, rStart + 1, cMid + 1, cols - 1, target);
        }
    }
}
