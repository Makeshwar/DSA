package org.example.Strings;

public class DetectCap {
    public boolean detectCapitalUse(String word) {
        if (word.equals(word.toUpperCase())) {
            return true;
        }


        // Check if all characters are lowercase
        if (word.equals(word.toLowerCase())) {
            return true;
        }

        // Check if only the first character is uppercase and the rest are lowercase
        if (Character.isUpperCase(word.charAt(0)) && word.substring(1).equals(word.substring(1).toLowerCase())) {
            return true;
        }

        // If none of the conditions are met, return false
        return false;
    }

    public static void main(String[] args) {
        DetectCap obj=new DetectCap();;
        System.out.println(obj.detectCapitalUse("FLAG"));
    }

}
