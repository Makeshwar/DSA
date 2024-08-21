package org.example;

public class MagicNumber {
    public static boolean isHappy(int n) {
        if(n<10){
            return false;
        }
        int sqr=0;
        while(n>0){
            int rem=n%10;
            sqr=sqr+rem*rem;
            n=n/10;
            if(n<=0  && sqr>=1 ){
                n=sqr;
            }
            if(n==1){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }
}
