package org.example.Sort.InsertionSort;

import java.util.Arrays;

public class Insertionsort {
    public static void main(String[] args) {
        int[] nums={5,4,3,2,1};
        insertsort(nums);
        System.out.println(Arrays.toString(nums));

    }
    static void insertsort(int[] nums){
        for (int i = 1; i < nums.length; i++) {
            for (int j = i; j > 0; j--) {
                if(nums[j]<nums[j-1]){
                    int temp=nums[j-1];
                    nums[j-1]=nums[j];
                    nums[j]=temp;
                }
                else{
                    break;
                }
            }
        }
    }
}
