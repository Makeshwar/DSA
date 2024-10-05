package org.example.PatternPrint;

public class Pattern11 {
    public static void main(String[] args) {
        String str="KABADI";
        for(int i=0;i<str.length();i++){
            for(int j=0;j<str.length()-i;j++){
                System.out.print(str.charAt(j));
            }
            System.out.print(" ");
            for(int j=str.length()-1-i;j>=0;j--){
                System.out.print(str.charAt(j));
            }
            System.out.println();
        }
    }
}