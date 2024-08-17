package org.example.Recursion.PatternPrint;

public class Pattern2 {

    public static void main(String[] args){
        int n=5;
        printpattern(n,0);
    }

    static  void printpattern(int row,int col){
        if (row==0){
            return;
        }
        if(col<row){
            printpattern(row,col+1);
            System.out.print("*");
        }
        else{
            printpattern(row-1,0);
            System.out.println();
        }
    }
}