package org.example.PatternPrint.Zoho;

public class ZohoCorporation {

    public static void main(String[] args) {
        String str = "zohocorporationteam";
        char[] ch=str.toCharArray();
        printZPattern(ch);
    }
    public static void printZPattern(char[] ch) {
        int n = ch.length;
        if (((n+2)%3!=0) || n < 4 ) {
            System.out.println("Pattern is not possible");
            return;
        }
        //top row
        int count=0;
        for (int i = 0; i < (n+2)/3; i++) {
            System.out.print(ch[i] + " ");
            count++;
        }
        System.out.println();
        int count1=count;
        //diagonal
        for (int i = 0; i < (n+2)/3 - 2; i++) {
            for (int j = 1; j < (n+2)/3 - i - 1; j++) {
                System.out.print("  ");
            }
            System.out.println(ch[count+i] + " ");
            count1++;
        }
        //bottom row
        for (int i = 0; i < (n+2)/3; i++) {
            System.out.print(ch[count1+i] + " ");
        }
    }
    }

