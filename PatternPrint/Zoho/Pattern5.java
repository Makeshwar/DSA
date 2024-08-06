package org.example.PatternPrint.Zoho;

public class Pattern5 {
    public static void main(String[] args){
        int n = 5;
        int startNum = 1;
        for (int i = 0; i < n; i++){
            int num = startNum;
            for (int j = 0; j < i + 1; j++){
                System.out.print(num + " ");
                num += 2;
            }
            startNum += 1;
            System.out.println();
        }
    }
}