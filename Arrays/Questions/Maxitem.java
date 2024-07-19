package org.example.Arrays.Questions;

import java.util.Scanner;

public class Maxitem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={1,80,3,4,6,6,7,8,9};
        int start=sc.nextInt();
        int end=sc.nextInt();
//        max(arr);
        System.out.println(max(arr));
        System.out.println(maxrange(arr,start,end));

    }
    static int maxrange(int[] arr,int start,int end) {
        int max=arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i]>max){
                max=arr[i];
            }

        }
        return max;
    }

     static int max(int[] arr) {
        int max=arr[0];
         for (int i = 1; i < arr.length; i++) {
             if (arr[i]>max){
                 max=arr[i];
             }

         }
         return max;
    }
}
