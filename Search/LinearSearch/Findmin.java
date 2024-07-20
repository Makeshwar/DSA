package org.example.Search.LinearSearch;

import java.util.Scanner;

public class Findmin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={12,43,312,-4,5,90};
        System.out.println(findmin(arr));
    }

     static int findmin(int[] arr) {
        int min=arr[0];
         for (int i = 1; i < arr.length; i++) {
             if (min>arr[i]){
                 min=arr[i];
             }
         }
         return min;
    }
}
