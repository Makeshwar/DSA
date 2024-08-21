package org.example.Strings;

import java.util.Arrays;

public class Anagram {
    public static boolean isAnagram(String s, String t){
        char[] ch=s.toCharArray();
        char[] c=t.toCharArray();

        Arrays.sort(ch);
        Arrays.sort(c);
        return Arrays.equals(ch, c);
    }

    public static void main(String[] args) {
        String s="anagrm";
        String t="gramana";
        System.out.println(isAnagram(s,t));
    }
}
