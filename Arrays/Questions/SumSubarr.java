package org.example.Arrays.Questions;

import java.util.ArrayList;
import java.util.Collections;

public class SumSubarr {
    public static int rangeSum(int[] nums, int n, int left, int right) {
        ArrayList<Integer> al = new ArrayList<>();
        int mod = Integer.MAX_VALUE;
        for(int i = 0 ; i < nums.length ; i++){
            int sum = 0;
            for(int j = i ; j < nums.length ; j++){
                sum += nums[j];
                sum %= mod;
                al.add(sum);
            }
        }
        Collections.sort(al);
        int sum = 0;
        for(int i = left-1 ; i < right ; i++){
            sum += al.get(i);
            sum %= mod;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        int n= nums.length;
        int left= 1;
        int right=10;
        System.out.println(rangeSum(nums,n,left,right));
    }
}
