package org.example.Recursion;

public class Fibonacci {

    public void printFibonacci(int n,int a,int b){
        if (n > 0){
            System.out.print(a + " ");  // Print the current Fibonacci number
            printFibonacci(n - 1, b, a + b);  // Recursive call with the next two Fibonacci numbers
        }
    }

    public static void main(String[] args) {
        Fibonacci obj=new Fibonacci();
        int a=0;
        int b=1;
       obj.printFibonacci(25,a,b);
    }
}