package org.example.Search.LinearSearch;

import java.util.Scanner;

public class SearchwithString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char ch=sc.nextLine().trim().charAt(0);
        System.out.println(search(str,ch));
    }
    static boolean search(String str,char c){
        if (str.isEmpty()){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==c){
                return true;
            }
        }
        return false;
    }
}
