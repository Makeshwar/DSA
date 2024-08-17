package org.example.PatternPrint;

public class Pattern10 {
    public static void main(String[] args) {
        String str="zoomorphic";
        printpattern(str);
    }
    static void printpattern(String str){

        for (int i = 1; i <= str.length(); i++) {
            for (int j = 0; j <= str.length()-1-i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <i ; j++) {
                System.out.print(str.charAt(j)+" ");
            }
            System.out.println();

        }

    }
}
