package org.example;
import java.util.*;
public class MyClass{
    public static List<String> cellsInRange(String s) {
        int[] arr=new int[2];
        char[] ch=new char[2];
        int j=0;
        int k=0;
        for(int i=0;i< s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                arr[j]=Character.getNumericValue(s.charAt(i));
                j++;
            }
            if (Character.isLetter(s.charAt(i))){
                ch[k]=s.charAt(i);
                k++;
            }
        }
        StringBuilder str=new StringBuilder();
        for (char c = ch[0] ; c <= ch[ch.length-1] ;c ++) {
            for (int i = arr[0]; i <= arr[arr.length-1] ; i++) {
                str.append(c).append(i).append(" ");

            }
        }
        String st=str.toString();
        String[] str1=st.split(" ");
        List<String> li = new ArrayList<>(Arrays.asList(str1));
        return li;
    }
    public static void main(String[] args) {
        String s="K1:L2";
        System.out.println(cellsInRange(s));
    }
}