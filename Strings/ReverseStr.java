package org.example.Strings;

public class ReverseStr {
    public static String reverseWords(String s) {
        String[] arr=s.split(" ");

        StringBuilder st=new StringBuilder();
        for(String str: arr){
            StringBuilder strr=new StringBuilder(str);
            strr.reverse();
            st=st.append(strr).append(" ");
        }
        return st.toString();
    }

    public static void main(String[] args) {
        String str="Let's take LeetCode contest";
        System.out.println(reverseWords(str));
    }
}
