package org.example.Recursion.Subseq;

import java.util.ArrayList;

public class StrSubseq {
    public static void main(String[] args) {
        subseq("","hello");
        System.out.println();
        System.out.println(subseq1("","hello",str));
        System.out.println(subSeq1("","hello"));
    }

    static ArrayList<String> str=new ArrayList<>();

    static void  subseq(String p,String up){
        if (up.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        char ch=up.charAt(0);
        subseq(p+ch,up.substring(1));
        subseq(p,up.substring(1));

    }
    static ArrayList<String> subseq1(String p,String up, ArrayList<String> str){
        if (up.isEmpty()){
            str.add(p);
            return str;
        }
        char ch=up.charAt(0);
        subseq1(p+ch,up.substring(1),str);
        subseq1(p,up.substring(1),str);
        return str;
    }
    static ArrayList<String> subSeq1(String p,String up){
        if (up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> left = subSeq1(p+ch,up.substring(1));
        ArrayList<String> right =subSeq1(p,up.substring(1));
        left.addAll(right);
        return left;
    }
}
