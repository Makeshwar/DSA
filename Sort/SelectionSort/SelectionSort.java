package org.example.Sort.SelectionSort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] nums) {
        boolean swapped=false;
        for (int i = 0; i < nums.length - 1; i++) {
            int maxIndex = nums.length-i-1;
            for (int j = 0; j < nums.length-i; j++) {
                if (nums[j] > nums[maxIndex]) {
                    maxIndex = j;
                    swapped =true;
                }
            }
            int temp = nums[maxIndex];
            nums[maxIndex]=nums[nums.length-i-1];
            nums[nums.length-i-1] = temp;
            if (!swapped){
                break;
            }
        }
    }
}
