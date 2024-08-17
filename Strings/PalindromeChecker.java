package org.example.Strings;

public class PalindromeChecker {
    public static boolean isPalindrome(String s) {
        String normalizedStr = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = normalizedStr.length() - 1;
        while (left < right) {
            if (normalizedStr.charAt(left) != normalizedStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;

    }
    public static boolean isPalindrome1(String s) {
        s=s.toLowerCase();
        char[] ch=s.toCharArray();
        StringBuilder str=new StringBuilder();
        for(char c : ch){
            if(Character.isLetter(c) || Character.isDigit(c)){
                str.append(c);
            }
        }
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i)!=str.charAt(str.length()-i-1)){
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "A man9, a plan , a canal : Pa9nama";
        System.out.println(isPalindrome(str1));
        System.out.println(isPalindrome1(str1)); // Output: true
// Output: true

    }
}
