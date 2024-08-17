package org.example.Sort.MergeSort;

import java.util.Arrays;

public class InPlace {
    public static void main(String[] args) {
        int[] arr = {34, 32, 45, 12, 56, 76, 23, 12};
        mergesortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void mergesortInPlace(int[] arr, int start, int end) {
        if (end - start < 2) {
            return;
        }
        int mid = start + (end - start) / 2;
        mergesortInPlace(arr, start, mid);
        mergesortInPlace(arr, mid, end);

        mergeInPlace(arr, start, mid, end);
    }

    static void mergeInPlace(int[] arr, int start, int mid, int end) {
        // Temporary array to hold the merged result
        int[] mix = new int[end - start];
        int i = start;
        int j = mid;
        int k = 0;

        // Merge the two halves into mix
        while (i < mid && j < end) {
            if (arr[i] <= arr[j]) {
                mix[k++] = arr[i++];
            } else {
                mix[k++] = arr[j++];
            }
        }

        // Copy remaining elements from the left half
        while (i < mid) {
            mix[k++] = arr[i++];
        }

        // Copy remaining elements from the right half
        while (j < end) {
            mix[k++] = arr[j++];
        }

        // Copy the merged result back into the original array
        for (int l = 0; l < mix.length; l++) {
            arr[start + l] = mix[l];
        }
    }
}