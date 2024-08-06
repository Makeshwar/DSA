package org.example.PatternPrint.Zoho;

public class Pattern4 {
    public static void main(String[] args) {
        int n=7;
        int start=1;
        int end=n;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j==start || j ==end){
                    System.out.print(j+" ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
            start++;
            end--;
        }
    }
}