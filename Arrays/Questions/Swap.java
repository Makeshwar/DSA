package org.example.Arrays.Questions;
import java.util.Arrays;
import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        Scanner sc= new Scanner(System.in);
        int m= sc.nextInt();;
        int n=sc.nextInt();
        swap(arr,m,n);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr,int index1, int index2){
        int temp= arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }

}