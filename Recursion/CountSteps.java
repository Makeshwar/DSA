package org.example.Recursion;

public class CountSteps {
    public static void main(String[] args) {
        int num=25;
        System.out.println(countsteps(num));
    }

    public static int countsteps(int num){
        if (num==0){
            return 0;
        }
        else {
            return helper(num,0);
        }
    }
    static int helper(int num,int count){
        if (num==0){
            return count;
        } else if (num%2==0) {
            return helper(num/2,count+1);
        }
        else{
            return helper(num-1,count+1);
        }
    }
}
