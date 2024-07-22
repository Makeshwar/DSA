package org.example.PatternPrint;

import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pattern7(n);
    }
    static void pattern7(int n){
        for (int i = 1; i <= n; i++) {
            for (int space = 0; space < n-i; space++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j+" ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
