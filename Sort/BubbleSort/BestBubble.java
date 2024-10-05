package org.example.Sort.BubbleSort;
import java.util.Scanner;
public class BestBubble {
    // Function to perform Bubble Sort in ascending order and count swaps
    public static int bubbleSortAscending(int[] arr) {
        int n = arr.length;
        int swapCount = 0;
        boolean swapped;
        // Perform bubble sort
        for (int i = 0; i < n - 1; i++){
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap the elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapCount++;
                    swapped = true;
                }
            }
            // If no swaps occurred in this pass, the array is already sorted
            if (!swapped) {
                break;
            }
        }
        return swapCount;
    }

    // Function to perform Bubble Sort in descending order and count swaps
    public static int bubbleSortDescending(int[] arr) {
        int n = arr.length;
        int swapCount = 0;
        boolean swapped;
        // Perform bubble sort
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    // Swap the elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapCount++;
                    swapped = true;
                }
            }
            // If no swaps occurred in this pass, the array is already sorted
            if (!swapped) {
                break;
            }
        }
        return swapCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int[] arrAsc = arr.clone();
        int[] arrDesc = arr.clone();

        // Calculate the number of swaps for ascending and descending order
        int ascendingSwaps = bubbleSortAscending(arrAsc);
        int descendingSwaps = bubbleSortDescending(arrDesc);

        // Output the minimum number of swaps required
        System.out.println(Math.min(ascendingSwaps, descendingSwaps));
    }
}
