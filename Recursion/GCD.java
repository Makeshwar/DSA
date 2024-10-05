package org.example.Recursion;

public class GCD {

    public int gcd(int a,int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }
    public static void main(String[] args) {
        GCD obj=new GCD();
        System.out.println(obj.gcd(12,6));
    }
}
