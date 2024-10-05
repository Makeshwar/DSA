package org.example.Strings;

import java.util.HashSet;
import java.util.Set;

public class ConsStrings {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> allowedSet = new HashSet<>();
        for (char c : allowed.toCharArray()) {
            allowedSet.add(c);
        }

        int consistentCount = 0;

        // Iterate through each word in the words array
        for (String word : words) {
            boolean isConsistent = true;

            // Check if each character in the word is allowed
            for (char c : word.toCharArray()) {
                if (!allowedSet.contains(c)) {
                    isConsistent = false;
                    break;
                }
            }

            // If the word is consistent, increment the count
            if (isConsistent) {
                consistentCount++;
            }
        }

        return consistentCount;

    }

    public static void main(String[] args) {
        ConsStrings obj=new ConsStrings();
        System.out.println(obj.countConsistentStrings("abc",new String[]{"a","b","c","ab","ac","bc","abc"}));
    }
}
