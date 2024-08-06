package org.example.Sort.Questions;

import java.util.Arrays;

public class SortArray {
    public static int[] sortArray(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        int n = max - min;
        int[] arr = new int[n + 1];
        for (int num : nums) {
            arr[num - min]++;
        }
        int index = 0;
        for (int i = 0; i <= n; i++) {
            while (arr[i] > 0) {
                nums[index] = min;
                index++;
                arr[i]--;
            }
            min++;
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] arr={5,1,1,2,0,0};
        System.out.println(Arrays.toString(sortArray(arr)));
    }
}