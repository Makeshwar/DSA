package org.example.Search.BinarySearch.Questions;

import java.util.Scanner;

public class Floor
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] nums={23,34,45,66,89,99};
        int n= sc.nextInt();
        System.out.println(ceiling(nums,n));
    }
    static int ceiling(int[] nums,int n){
        int start=0;
        int end= nums.length-1;
        if (nums[end]<n){
            return -1;
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]<n){
                start=mid+1;
            } else if (nums[mid]>n) {
                end=mid-1;
            }
            else{
                return nums[mid];
            }
        }
        return nums[end];
    }
}
