package org.example.Strings;

public class Example {
    public static void main(String[] args) {

        String a = "aaa.bbbb.cc.dd";
        int count=0;
        int max=0;

        // Split the string by the dot character (.)
        String[] parts = a.split("\\."); // We need to escape the dot (.) as it's a regex special character
        for (String s:parts){
            count=s.length();
            max=Math.max(max,count);
        }
        // Print the parts
        System.out.println(max);
    }
}
