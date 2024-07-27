package org.example.Arrays.Questions;
import java.util.Arrays;
public class Reversearr{
    public static void main(String[] args) {
        int[] arr={2,5,3,8,9,4,2,8,5,9,5,6};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
     static void reverse(int[] arr) {
         for (int i = 0; i < arr.length/2; i++) {
             int temp=arr[i];
             arr[i]=arr[arr.length-i-1];
             arr[arr.length-i-1]=temp;
         }
    }
}