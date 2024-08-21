package org.example.Strings;

public class Removetrailingzeros {
    public static String removeTrailingZeros(String num) {
        char[] ch=num.toCharArray() ;
        for(int i=num.length()-1;i>=0;i--){
            if(ch[i]!='0' ){
                return num.substring(0,i+1);
            }
        }

        return "";

    }

    public static void main(String[] args) {
        System.out.println(removeTrailingZeros("123456500"));
    }
}
