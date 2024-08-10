package org.example.Recursion;

public class Palindrome {
    static int sum=0;
    public static void main(String[] args) {
        int num=2438342;
        rev(num);
        System.out.println(palindrome(num));
    }
    static boolean palindrome(int num){
        return num==sum;
    }
    static void rev(int num){
        if (num == 0) {
            return;
        }
        int rem=num%10;
        sum=sum*10+rem;
        rev(num/10);
    }
}
