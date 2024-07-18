package org.example.FunctionsandMethods;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int[] numbers = {num1, num2};
        swapnumbers(numbers);
        System.out.println(numbers[0]+" "+numbers[1]);
    }
    static void swapnumbers(int[] nums){
        int temp=nums[0];
        nums[0]=nums[1];
        nums[1]=temp;
    }
}
