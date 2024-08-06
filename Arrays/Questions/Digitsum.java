package org.example.Arrays.Questions;

import java.util.Scanner;

public class Digitsum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(digitsum(arr));
    }
    
    static int digitsum(int[] arr){
        int sum=0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int a=arr[i];
                int b=arr[j];
                while (a >0 && b >0){
                    int temp=a%10;
                    int temp1=b%10;
                    int diff=temp-temp1;
                    a=a/10;
                    b=b/10;
                    sum+=Math.abs(diff);
                }
            }
        }
        return sum;
    }
}