package org.example.Sort.CycleSort;

import java.util.Arrays;

public class Setmismatch {
    public static void main(String[] args) {
        int[] nums={4,2,2,1};
        System.out.println(Arrays.toString(setmis(nums)));
    }
    public static int[] setmis(int[] nums) {
        int i=0;
        while (i<nums.length){
            int correct=nums[i]-1;
            if (nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else {
                i++;
            }
        }
        for(int index=0;index<nums.length;index++){
            if(nums[index]!=index+1){
                return new int[]{nums[index],index+1};
            }

        }
        return new int[]{-1,-1};
    }
    static void  swap(int[] arr,int s_start,int s_end){
        int temp=arr[s_end];
        arr[s_end]=arr[s_start];
        arr[s_start]=temp;
    }
}
