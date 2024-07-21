package org.example.Search.BinarySearch.Questions;

import java.util.Scanner;

public class SearchinMountain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int[] nums={3,4,5,3,1};
        int target=sc.nextInt();
        System.out.println(search(nums,target));

    }
     static  int  search(int[] nums,int target){
        int peak=peakindex(nums);
        int firsttry=orderagnosticbinarysearch(nums,target,0,peak);
        if (firsttry!=-1){
            return firsttry;
        }

        return orderagnosticbinarysearch(nums,target,peak,nums.length-1);
    }
    static  int  peakindex(int[] nums ){
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
        return start;
    }
    static int orderagnosticbinarysearch(int[] nums,int n,int start,int end){
        boolean isAsc = nums[start]<nums[end];
        while (start<=end){
            int mid=start+(end-start)/2;
            if (nums[mid]==n){
                return mid;
            }
            if (isAsc){
                if (n<nums[mid]){
                    end=mid-1;
                }
                else if (n>nums[mid]){
                    start=mid+1;
                }
            }
            else {
                if (n>nums[mid]){
                    end=mid-1;
                }
                else if (n<nums[mid]){
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}
