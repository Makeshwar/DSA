package org.example.PatternPrint;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pattern5(n);
    }
    static void pattern5(int n){
        for (int i = 0; i < 2*n; i++) {
            int totalcolsinrow = i>n ? 2*n - i : i;
            for (int j = 0; j < totalcolsinrow; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}
