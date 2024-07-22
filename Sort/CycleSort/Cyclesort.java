package org.example.Sort.CycleSort;

import java.util.Arrays;

public class Cyclesort {
    public static void main(String[] args) {
        int[] nums={3,5,2,1,4};
        cyclesort(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void cyclesort(int[] nums){
        int i=0;
        while (i<nums.length-1){
            int correct=nums[i]-1;
            if (nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else {
                i++;
            }
        }
    }
    static void  swap(int[] arr,int s_start,int s_end){
        int temp=arr[s_end];
        arr[s_end]=arr[s_start];
        arr[s_start]=temp;
    }
}
