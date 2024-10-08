package org.example.Sort.BubbleSort;

import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        int[] nums = {5,2,1,4,3};
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void bubbleSort(int[] nums) {
        boolean swapped;
        for (int i = 0; i < nums.length - 1; i++) {
            swapped = false;
            for (int j = 1; j < nums.length - i; j++) {
                if (nums[j] < nums[j - 1]){
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
}
