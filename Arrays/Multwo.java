package org.example.Arrays;

public class Multwo {
    public static int findFinalValue(int[] nums, int original) {
        int prod=original;
        int i=0;
        while(i< nums.length){
            if(nums[i]==prod){
                prod=prod*2;
                i=0;
            }
            else{
                i++;
            }
        }
        return prod;
    }

    public static void main(String[] args) {
        int[] nums={8,19,4,2,15,3};
        System.out.println(findFinalValue(nums,2));
    }
}
