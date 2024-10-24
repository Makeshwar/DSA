package org.example;
import java.util.Scanner;

public class Buyandsell {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int maxprofit=0;
        int[] prices=new int[n];
        for (int i = 0; i < n; i++) {
            prices[i]=sc.nextInt();
        }
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if(prices[i]<prices[j]) {
                    int currprofit = Math.abs(prices[i] - prices[j]);
                    maxprofit = Math.max(maxprofit, currprofit);
                }
            }
        }
        System.out.println(maxprofit);
    }
}