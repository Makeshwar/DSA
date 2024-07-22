package org.example.Sort.CycleSort;

import java.util.ArrayList;
import java.util.List;

public class Missingnums {
    public static void main(String[] args) {
        int[] nums={3,1,2,4,8,7,9,6,5,20,21,12,15,18,19,14,10};
        List<Integer> ans = findDisappearedNumbers(nums);
        System.out.println(ans);
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        while (i<nums.length){
            int correct=nums[i]-1;
            if (nums[i] <= nums.length &&nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else {
                i++;
            }
        }
        List<Integer> ans =new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index]!=index+1){
                ans.add(index+1);
            }
        }
        return ans;
    }

    static void  swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    }

