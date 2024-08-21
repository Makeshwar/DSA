package org.example.Strings;

public class Finddiff {
    public static char findTheDifference(String s, String t) {
        int[] freq=new int[26];
        int[] freq1=new int[26];
        for(char c: t.toCharArray()){
            freq[c-'a']++;
        }for(char ch: s.toCharArray()){
            freq1[ch-'a']++;
        }
        for(int i=0;i<26;i++){
            if(freq[i]>freq1[i]){
                return  (char)(i+'a');
            }
        }
        return '0';
    }
    public static void main(String[] args) {
        System.out.println(findTheDifference("","y"));
    }
}
