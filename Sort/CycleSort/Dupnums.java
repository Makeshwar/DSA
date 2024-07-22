package org.example.Sort.CycleSort;

import java.util.Arrays;

public class Dupnums {
    public static void main(String[] args) {
        int[] nums={3,1,2,4,3};
        System.out.println(dupnums(nums));
    }
    //easy approach non cyclic sort
//    static int dupnums1(int[] nums){
//        for (int i = 0; i < nums.length; i++) {
//
//            int value = Math.abs(nums[i]) - 1;
//
//            if (nums[value] < 0) return Math.abs(nums[i]);
//
//            nums[value] = -nums[value];
//        }
//        return -1;
//    }

    //cyclic sort
    static int dupnums(int[] nums){
        int i=0;
        while (i<nums.length){
            if (nums[i]!=i+1){
                int correct=nums[i]-1;
                if (nums[i]!=nums[correct]){
                    swap(nums,i,correct);
                }
                else {
                    return nums[i];
                }
            }
            else {
                i++;
            }
        }
        return -1;

    }
    static void  swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
