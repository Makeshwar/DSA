package org.example.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Keyboardrow {
    public String[] findWords(String[] words) {
        // Define the keyboard rows
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        // List to store the result
        List<String> result = new ArrayList<>();

        // Check each word
        for (String word : words) {
            String lowerWord = word.toLowerCase();

            if (allInOneRow(lowerWord, row1) || allInOneRow(lowerWord, row2) || allInOneRow(lowerWord, row3)) {
                result.add(word);  // Add the original word if it can be typed using one row
            }
        }

        // Convert the list to an array and return
        return result.toArray(new String[0]);
    }

    // Helper method to check if all characters in a word belong to the same row
    private boolean allInOneRow(String word, String row) {
        for (char c : word.toCharArray()) {
            if (row.indexOf(c) == -1) {
                return false;  // If any character is not in the row, return false
            }
        }
        return true;  // If all characters are in the row, return true
    }

    public static void main(String[] args) {
        String[] words = {"Hello","Alaska","Dad"};
        Keyboardrow obj=new Keyboardrow();
        System.out.println(Arrays.toString(obj.findWords(words)));
    }
}
