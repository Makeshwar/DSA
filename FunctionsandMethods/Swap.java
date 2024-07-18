package org.example.FunctionsandMethods;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        swapnumbers(num1,num2);
    }
    static void swapnumbers(int a, int b){
        int temp=a;
        a=b;
        b=temp;
    }
}
