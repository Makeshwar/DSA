package org.example.Strings;

import java.util.Arrays;

public class ReverseLetters {

    public String reverseOnlyLetters(String s) {
        StringBuilder str1=new StringBuilder();
        int i=0;
        int j=s.length()-1;
        while(i<s.length() && j>=0) {
            if (Character.isLetter(s.charAt(j)) && Character.isLetter(s.charAt(i))) {
                str1.append(s.charAt(j));
                j--;
                i++;
            }
            else if(!Character.isLetter(s.charAt(i))){
                str1.append(s.charAt(i));
                i++;
            }
            else if (!Character.isLetter(s.charAt(j)) ) {
                j--;
            }
            if(i<s.length() && j<=0){
                j=0;
            }
        }
        return str1.toString();
    }
    public static void main(String[] args) {
        ReverseLetters obj=new ReverseLetters();
        System.out.println(obj.reverseOnlyLetters("-"));
        //Qedo1ct-eeLg=ntse-T!
    }
}
