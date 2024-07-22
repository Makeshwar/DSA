package org.example.Sort.CycleSort;

public class Firstmisspos {
    public static void main(String[] args) {
        int[] nums={7,8,9,11,12};
        System.out.println(misspos(nums));
    }
    static int misspos(int[] nums){
        int i=0;
        while (i<nums.length){
            if(nums[i]>0) {
                int correct = nums[i] - 1;
                if (correct < nums.length && nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                } else {
                    i++;
                }
            }
            else {
                i++;
            }
        }
        for (int index = 0; index < nums.length; index++) {
            if (index!=nums[index]-1){
                return index+1;
            }
        }
        return nums.length+1;
    }
    static void  swap(int[] arr,int first,int second){
        int temp=arr[second];
        arr[second]=arr[first];
        arr[first]=temp;
    }
}
