package org.example.PatternPrint.Zoho;

import java.util.Scanner;

public class LongestPalSubstr {
    public static String longestPalindrome(String s){
        if (s == null || s.length() < 1) {
            return "";
        }
        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i); // for odd length palindromes like "aba"
            int len2 = expandAroundCenter(s, i, i + 1); // for even length palindromes like "abba"
            int len = Math.max(len1, len2);

            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }
    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String s1 = sc.nextLine();
            System.out.println(longestPalindrome(s1));
        }


}


