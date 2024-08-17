package org.example.Recursion;

import java.util.ArrayList;
import java.util.List;

public class KeyPad {
    public static void main(String[] args) {
        String digits="1";
        System.out.println(letterCombinations(digits));
    }
    public static List<String> letterCombinations(String digits) {
        if(digits.isEmpty()){
            ArrayList<String> str = new ArrayList<>();
            return str;
        }
        return keypad("",digits);
    }

    static List<String> keypad(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit =up.charAt(0)-'0' -1;
        int i = (digit-1)*3;
        if(digit > 7) {
            i+=1;
        }
        int len = i+3;
        if(digit == 7 || digit == 9) {
            len+=1;
        }
        ArrayList<String> li = new ArrayList<>();
        for (;i < len; i++) {
            char ch= (char) ('a'+i);
             li.addAll(keypad(p+ch,up.substring(1)));
        }
        return li;
    }
}
