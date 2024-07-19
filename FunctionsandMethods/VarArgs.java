package org.example.FunctionsandMethods;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,3,4,5,6,7,4,2,1,4,53,3,5,3,5,53,5);
        multiple(2,3,"makesh","rohan","maneesh");
    }
    static void multiple(int a,int b, String ...v){
        System.out.println(a+" "+b+" "+Arrays.toString(v));
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}