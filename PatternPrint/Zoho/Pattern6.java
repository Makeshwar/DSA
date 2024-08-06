package org.example.PatternPrint.Zoho;

public class Pattern6 {
    public static void main(String[] args) {
        int n=5;
        int x = 1;
        int inc = n;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                System.out.print("   ");
            }
            int dec = n-i;
            int y = x;
            for(int j=0; j<=i; j++){
                System.out.print(y + " ");
                y -= dec;
                dec++;
            }
            x += inc;
            inc--;
            System.out.println();
        }

    }
}
