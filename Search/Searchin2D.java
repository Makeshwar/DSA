package org.example.Search;

import java.util.Arrays;
import java.util.Scanner;

public class Searchin2D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr={
                {56,8,9,6},
                {98,5,32},
                {26,12},
                {90,54,7,2,1}
        };
        int n=sc.nextInt();
        int[] ans= search(arr,n);
        System.out.println(Arrays.toString(ans));
    }
     static int[] search(int[][] arr, int n) {
         for (int rows = 0; rows < arr.length; rows++) {
             for (int cols = 0; cols < arr[rows].length; cols++) {
                 if (arr[rows][cols]==n){
                     return new int[]{rows,cols};
                 }
             }
         }
         return new int[]{-1,-1};
    }
}
