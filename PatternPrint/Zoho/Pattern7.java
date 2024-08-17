package org.example.PatternPrint.Zoho;

public class Pattern7 {
    public static void main(String[] args) {
        String str="hello";
        printpattern(str);
    }
    static void printpattern(String str){
        for (int i = 0; i <= str.length()-1; i++) {
            for (int j = 0; j <=str.length()-1; j++) {
                if(j==i || j==str.length()-1-i){
                    System.out.print(str.charAt(j)+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }

}
