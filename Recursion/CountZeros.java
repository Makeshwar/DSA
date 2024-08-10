package org.example.Recursion;

public class CountZeros {
    public static void main(String[] args) {
         int num= 30212340;
        System.out.println(countzero(num,0));
    }
    public static int countzero(int num,int count){
        if(num==0){
            return count;
        } else if (num%10==0) {
            return countzero(num/10,count+1);
        }
        else{
            return countzero(num/10,count);
        }
    }

}
