package org.example.FunctionsandMethods;

public class Overloading {
    public static void main(String[] args) {
        fun(90,35);
        fun(25);
        fun("hiiiii");

    }
    static void fun(int n){
        System.out.println(n);

    }
    static  void fun(int num,int num1){
        System.out.println(num+" "+num1);
    }
    static  void fun(String s){
        System.out.println(s);
    }
}
