package org.example.Search.BinarySearch;

import java.util.Scanner;

public class SearchTarget {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for (int i = 0; i < n; i++) {
            nums[i]=sc.nextInt();
        }
        int no=sc.nextInt();
        System.out.println(binarysearch(nums,no));
    }
    static int binarysearch(int[] nums,int n){
        int start=0;
        int end= nums.length-1;
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
