package org.example.Search.LinearSearch;

public class EvenDig {
    public static void main(String[] args) {

        int[] nums={18,1824,9,1764,98,1};
        System.out.println(findevendig(nums));

    }

    static  boolean evendig(int num){
        return ((int)(Math.log10(num)+1))%2==0;
    }

    static int digits(int num){
        if (num<0){
            num=num*-1;
        }
        if (num==0){
            return 1;
        }
        int count=0;
        while (num>0){
            count++;
            num=num/10;
        }
        return count;
    }
    static  int findevendig(int[] nums){
        int count=0;
        for (int num: nums) {
            if (evendig(num)) {
                count++;
            }
        }
        return count;
    }

     static boolean even(int num){
        if (num<0){
            num=num*-1;
        }
        int count=0;
        while (num>0){
           count++;
           num=num/10;
        }
         return count % 2 == 0;
     }
}
