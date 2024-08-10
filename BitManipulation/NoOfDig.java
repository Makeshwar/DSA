package org.example.BitManipulation;
public class NoOfDig {
    public static void main(String[] args) {
        int n=3467;
        int b=2;//base
        int ans=(int)(Math.log(n)/Math.log(b))+1;
        System.out.println(ans);
    }
}