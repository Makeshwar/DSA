package org.example.Recursion.PatternPrint;

public class Pattern1 {

    public static void main(String[] args) {
        int n=5;
        PrintPattern(n,0);
    }

    static void PrintPattern(int row,int col){
        if (row==0){
            return;
        }
        if(col<row){
            System.out.print("*");
            PrintPattern(row,col+1);
        }
        else{
            System.out.println();
            PrintPattern(row-1,0);
        }
    }
}
