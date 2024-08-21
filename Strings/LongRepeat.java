package org.example.Strings;

public class LongRepeat {
    public  static int characterReplacement(String s, int k) {
        int[] charCount = new int[26];
        int maxCount = 0, maxLength = 0;

        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            charCount[s.charAt(right) - 'A']++;
            maxCount = Math.max(maxCount, charCount[s.charAt(right) - 'A']);

            // If the current window size minus the maxCount is greater than k, shrink the window
            if (right - left + 1 - maxCount > k) {
                charCount[s.charAt(left) - 'A']--;
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(characterReplacement("AABABBA",1));
    }
}
