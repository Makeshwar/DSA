package org.example.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //fixed length
        int[][] arr=new int[3][3];
        //variable length
        int[][] arr1={
                {1,2,3,4},
                {5,6},
                {7,8,9}
        };
        //arr
        System.out.println(arr.length);
        for (int rows = 0; rows < arr.length; rows++) {
            for (int cols = 0; cols < arr[rows].length; cols++) {
                arr[rows][cols]= sc.nextInt();
            }
        }
        for (int rows = 0; rows < arr.length; rows++) {
            for (int cols = 0; cols < arr[rows].length; cols++) {
                System.out.print(arr[rows][cols]+" ");
            }
            System.out.println();
        }
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }
        for(int[] row : arr){
            System.out.println(Arrays.toString(row));
        }
        //arr1
        for (int rows = 0; rows < arr1.length; rows++) {
            for (int cols = 0; cols < arr1[rows].length; cols++) {
                System.out.print(arr1[rows][cols]+" ");
            }
            System.out.println();
        }
        for(int[] row : arr1) {
            System.out.println(Arrays.toString(row));
          }
        }
    }