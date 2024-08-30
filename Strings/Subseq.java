package org.example.Strings;

public class Subseq {
    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) {
            return true;
        }
        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();
        int j = 0;
        for (int i = 0; i < charT.length; i++) {
            if (charT[i] == charS[j]) {
                if (j == charS.length - 1) {
                    return true;
                }
                j++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Subseq obj=new Subseq();

        System.out.println(obj.isSubsequence("abc","ahbgdc"));
    }
}
