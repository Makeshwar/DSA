package org.example.Strings;

public class Palindrome {
    public static void main(String[] args) {
        String str="ma";
        palindrome(str);
    }
    static void palindrome(String str){
        boolean pal=false;
        for (int i=0;i<=str.length()/2;i++){
            if (str.charAt(i)==str.charAt(str.length()-1-i)){
                pal=true;
            }
        }
        if (pal){
            System.out.println("palindrome");
        }
        else {
            System.out.println("not palindrome");
        }

    }
}
