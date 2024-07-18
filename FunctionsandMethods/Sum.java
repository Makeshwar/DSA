package org.example.FunctionsandMethods;
import java.util.Scanner;
public class Sum {
    //no return type
    static void sum(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1=sc.nextInt();
        System.out.print("Enter number 2: ");
        int num2=sc.nextInt();
        int sum= num1+num2;
        System.out.println("The sum = "+sum);
    }
    //return int value
    static int sum2(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1=sc.nextInt();
        System.out.print("Enter number 2: ");
        int num2=sc.nextInt();
        int sum= num1+num2;
        return sum;
    }
    //return int with parameters
    static int sum3(int a,int b){
        int sum=a+b;
        return sum;
    }
    public static void main(String[] args) {
        int ans = sum3(20,30);
        System.out.println(ans);
    }
}
