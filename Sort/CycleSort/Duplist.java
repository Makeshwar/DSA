package org.example.Sort.CycleSort;

import java.util.ArrayList;
import java.util.List;

public class Duplist {

    public static void main(String[] args) {
        int[] nums={4,3,2,7,8,8,9,9,9,2,3,1};
        System.out.println(findDuplicates(nums));

    }
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans =new ArrayList<>();
        int i=0;
        while (i<nums.length){
            if (nums[i]!=i+1){
                int correct=nums[i]-1;
                if (nums[i]!=nums[correct]){
                    swap(nums,i,correct);
                }
                else {
                    if (!ans.contains(nums[i])) {
                        ans.add(nums[i]);
                    }
                    i++;
                }
            }
            else {
                i++;
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
