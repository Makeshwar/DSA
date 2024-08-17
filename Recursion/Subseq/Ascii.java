package org.example.Recursion.Subseq;

import java.util.ArrayList;

public class Ascii {
    public static void main(String[] args) {

        subseqAscii("","abc");
        System.out.println();
        System.out.println(subSeqAscii("","abc"));

    }

    static void  subseqAscii(String p,String up){
        if (up.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        char ch=up.charAt(0);

        subseqAscii(p+ch,up.substring(1));
        subseqAscii(p,up.substring(1));
        subseqAscii(p+(ch+0),up.substring(1));
    }

    static ArrayList<String> subSeqAscii(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> left = subSeqAscii(p+ch,up.substring(1));
        ArrayList<String> right =subSeqAscii(p,up.substring(1));
        ArrayList<String> ascii =subSeqAscii(p+(ch+0),up.substring(1));
        left.addAll(right);
        left.addAll(ascii);
        return left;
    }
}
