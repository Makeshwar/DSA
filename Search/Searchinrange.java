package org.example.Search;

import java.util.Scanner;

public class Searchinrange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={67,8,4,3,-7,15,28};
        int n=sc.nextInt();
        int start=sc.nextInt();
        int end=sc.nextInt();
        System.out.println(searchinrange(arr,n,start,end));
    }

     static int searchinrange(int[] arr, int n,int start,int end){
        if (arr.length==0){
            return  -1;
        }
         for (int i = start; i <= end; i++) {
             if (arr[i]==n){
                 return i;
             }
         }
         return -1;

    }


}
