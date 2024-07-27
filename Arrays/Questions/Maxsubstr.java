package org.example.Arrays.Questions;
public class Maxsubstr {
    public static int balancedStringSplit(String s) {
        int countL = 0;
        int countR = 0;
        int balancedCount = 0;
        for (char c : s.toCharArray()) {
            if (c == 'L') {
                countL++;
            } else if (c == 'R') {
                countR++;
            }

            if (countL == countR) {
                balancedCount++;
                countL = countR = 0;
            }
        }

        return balancedCount;
    }
    public static void main(String[] args) {
        String s1 = "RLRRLLRLRL";
        System.out.println(balancedStringSplit(s1));
    }
}
