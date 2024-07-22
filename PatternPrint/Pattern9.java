package org.example.PatternPrint;

import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pattern9(n);
    }
    static void pattern9(int n){
        int k=2*n-2;
        for (int i = 0; i <= k; i++) {
            for (int j = 0; j <= k; j++) {
                int ateveryindex=Math.min(Math.min(j,k-j),Math.min(i,k-i));
                System.out.print((n-ateveryindex)+" ");
            }
            System.out.println();
        }
    }
}
