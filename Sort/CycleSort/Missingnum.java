package org.example.Sort.CycleSort;

public class Missingnum {
    public static void main(String[] args) {
        int[] nums={3,1,2,4,8,7,9,6,5,12,10};
        System.out.println(missingnum(nums));
    }
    static int missingnum(int[] nums){
        int i=0;
        while (i<nums.length){
            int correct=nums[i]-1;
                if (correct<nums.length&& nums[i]!=nums[correct]){
                    swap(nums,i,correct);
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