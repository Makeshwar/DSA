package org.example;

public class Countdig {
    public static void main(String[] args) {
        int a=245687654;
        int count=0;

        while(a>0){
            a=a/10;
            count++;

        }
        System.out.println(count);
    }
}
