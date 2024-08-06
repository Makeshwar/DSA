package org.example.PatternPrint.Zoho;

public class Pattern3 {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <= n; i++) {
            int count =i;
            System.out.print(i+" ");
            for (int j = 0; j < n-1; j++) {
                count+=1;
                if (count>n){
                    count=count%n;
                }
                System.out.print(count+" ");

            }
            System.out.println();
        }
    }
}
