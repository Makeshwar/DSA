package org.example.Search.BinarySearch.Questions;

import java.util.Scanner;

public class DuplicateRotatedSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={2,2,3,4,5,6,7,0,1,2};
        int target=sc.nextInt();
        System.out.println(search(arr,target));
    }
    static int search(int[] arr,int target){
        int pivot=pivotwithdupl(arr);
        if (pivot==-1){
            return binarysearch(arr,target,0,arr.length-1);
        }
        if (arr[pivot]==target){
            return pivot;
        }
        if (target>=arr[0]){
            return binarysearch(arr,target,0,pivot-1);
        }
        return binarysearch(arr,target,pivot+1,arr.length-1);
    }
    static int binarysearch(int[] nums,int n,int start,int end){
        while (start<=end){
            int mid=start+(end-start)/2;
            if (n<nums[mid]){
                end=mid-1;
            }
            else if (n>nums[mid]){
                start=mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
    static int pivotwithdupl(int[] arr){
        int start=0;
        int end= arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if (mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if (arr[mid]==arr[start] &&arr[mid]==arr[end]){
                if (arr[start]>arr[start+1]){
                    return start;
                }
                start++;
                if (arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
            } else if (arr[start]<arr[mid] || (arr[start]==arr[mid] && arr[mid]>arr[end])) {
                start=mid+1;
            }else {
                end=mid-1;
            }

        }
        return -1;
    }
}
