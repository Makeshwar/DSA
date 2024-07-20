package org.example.Search.LinearSearch;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr={13,67,34,98,45,77};
        int n=sc.nextInt();
        int pos = linearsearch(arr,n);
        System.out.println(pos);
    }
     static int linearsearch(int[] arr, int n) {
         for (int i = 0; i < arr.length; i++) {
             if(arr[i]==n){
                 return i+1;
             }
         }
         if(arr.length==0){
             return -1;
         }
         return -1;
    }
}