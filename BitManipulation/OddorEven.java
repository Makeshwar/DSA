package org.example.BitManipulation;

public class OddorEven {
    public static void main(String[] args) {
        int n=0;
        System.out.println(isOdd(n));
    }
    static boolean isOdd(int n){
        return ((n&1) ==1);
    }
}