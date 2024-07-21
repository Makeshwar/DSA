package org.example.Search.BinarySearch.Questions;
import java.util.Arrays;
import java.util.Scanner;

public class FirstandLast {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] nums={2,4,7,8,9};
        int target = sc.nextInt();
        System.out.println(Arrays.toString(searchRange(nums,target)));

    }
    public static int[] searchRange(int[] nums,int target){
        int[] ans={-1,-1};
        ans[0]=search(nums,target,true);
        if (ans[0]!=-1){
            ans[1]=search(nums,target,false);
        }
        return ans;
    }
    static  int  search(int[] nums,int target, boolean findStartIndex){
        int ans=-1;
        int start=0;
        int end= nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]<target){
                start=mid+1;
            } else if (nums[mid]>target) {
                end=mid-1;
            }
            else{
                ans= mid;
                if (findStartIndex){
                    end=mid-1;
                }
                else {
                    start=mid+1;
                }
            }
        }
        return ans;
    }
    }
