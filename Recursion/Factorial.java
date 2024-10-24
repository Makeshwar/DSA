package org.example.Recursion;

public class Factorial {

    public int fact(int n){
        if(n==0){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {

        Factorial obj=new Factorial();
        System.out.println(obj.fact(7));

    }
}
