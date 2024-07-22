package org.example.PatternPrint;

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pattern6(n);
    }
    static void pattern6(int n){
        for (int i = 1; i <= 2*n-1; i++) {
            int totalcolsinrow = i>n ? 2*n - i : i;
            int noofspaces = n-totalcolsinrow;
            for (int s = 1; s <= noofspaces; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= totalcolsinrow; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
