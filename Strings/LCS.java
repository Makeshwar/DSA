package org.example.Strings;

public class LCS {
    public static void main(String[] args) {
        String str="ABCDFE";
        char[] ch=str.toCharArray();
        String str1="ACFDEHGFFB";
        char[] ch1=str1.toCharArray();
        StringBuilder stri=new StringBuilder();
        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < ch1.length; j++) {
                if (ch[i]==ch1[j]){
                    stri.append(ch[i]);
                }
            }
        }
        System.out.println(stri);
    }
}