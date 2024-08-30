package org.example.Strings;

import java.util.Arrays;

public class NumberofLines {
    public int[] numberOfLines(int[] widths, String s) {
        int[] result = new int[2];
        int lines = 1;
        int currentWidth = 0;

        for (int i = 0; i < s.length(); i++) {
            int charWidth = widths[s.charAt(i) - 'a'];

            if (currentWidth + charWidth > 100) {
                lines++;
                currentWidth = charWidth;
            } else {
                currentWidth += charWidth;
            }
        }

        result[0] = lines;
        result[1] = currentWidth;
        return result;
    }

    public static void main(String[] args) {
        NumberofLines obj=new NumberofLines();
        int[] widths = {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        String s = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(Arrays.toString(obj.numberOfLines(widths, s)));
    }
}
