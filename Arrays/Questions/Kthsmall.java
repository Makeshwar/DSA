package org.example.Arrays.Questions;

import java.util.Arrays;

public class Kthsmall {
        public static int smallestDistancePair(int[] nums, int k) {
            int n= nums.length;;
            int[] arr= new int[n*(n-1)/2];
            int count=0;
            for(int i=0;i<n-1;i++){
                for(int j=i+1;j<nums.length;j++){
                    arr[count++]=Math.abs(nums[i]-nums[j]);
                }
            }
            Arrays.sort(arr);
            return arr[k-1];
        }

    public static void main(String[] args) {

            int[] nums={1,6,1};
        System.out.println(smallestDistancePair(nums,3));


    }
    }

