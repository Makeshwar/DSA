package org.example.Search.BinarySearch.Questions;

public class PeakMountainArr {
    public static void main(String[] args) {
        int[] nums={12,34,45,56,43,32,21,10};
        System.out.println(search(nums));

    }
    static  int  search(int[] nums ){
        int start=0;
        int end=nums.length-1;
        while(start< end){
            int mid=start+(end-start)/2;
            if(nums[mid]>nums[mid+1]){
                end=mid;
            } else  {
                start=mid+1;
            }

        }
        return nums[start];
    }
}
