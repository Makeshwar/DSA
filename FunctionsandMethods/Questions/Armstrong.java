package org.example.FunctionsandMethods.Questions;

public class Armstrong {
    public static void main(String[] args) {
        Armstrongno();
    }
    static void Armstrongno(){
        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)){
                System.out.println(i+" is Armstrong Number");
            }
        }
    }
    static boolean isArmstrong(int num){
            int sum=0;
            int temp=num;
            while(num>0){
                int rem=num%10;
                sum += rem*rem*rem;
                num=num/10;
            }
        return sum == temp;
    }
    }

