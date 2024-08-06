package org.example.PatternPrint.Zoho;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for (int i = 0; i < n; i++) {
            System.out.print(i+1+" ");
            for (int j = 0; j < i; j++) {
                 count+=4-j;
                System.out.print(i+count+1+" ");
            }
            count=0;
            System.out.println();
        }
        System.out.println();

    }
}
