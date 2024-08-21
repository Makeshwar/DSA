package org.example.Arrays;

import java.util.Arrays;

public class Countbits {
    public static int[] countBits(int n) {
        int sum=0;
        int[] arr=new int[n+1];
        for(int i=0;i<=n;i++){
            String s=Integer.toBinaryString(i);
            char[] ch=s.toCharArray();
            for(char c: ch) {
                sum += Character.getNumericValue(c);
            }
            arr[i]=sum;
            sum=0;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(5)));
    }
}
