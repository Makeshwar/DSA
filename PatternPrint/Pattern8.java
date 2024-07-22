package org.example.PatternPrint;

import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pattern8(n);

    }
    static void pattern8(int n){
        for (int i = 1; i <= 2*n-1; i++) {
            int c = i>n ? 2*n - i : i;
            for (int s = 1; s <= n-c; s++) {
                System.out.print("  ");
            }
            for (int j = c; j >= 1; j--) {
                System.out.print(j+" ");
            }
            for (int j = 2; j <= c; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
