package org.example.Recursion.String;

public class SkipaChar {

    public static void main(String[] args) {
        skip("","heoaaaaollattyh");
        System.out.println(skip1("heoaaaaollattyh"));
        System.out.println(skipApple("heoaappleaaaoapplellattyh"));
        System.out.println(skipApp("heoaappaaaoapplellattyh"));
    }

    static void skip(String p ,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        if (ch=='a'){
            skip(p,up.substring(1));
        }
        else {
            skip(p+ch,up.substring(1));
        }
    }

    static String skip1(String up){
        if(up.isEmpty()){
            return "";
        }
        char ch=up.charAt(0);
        if (ch=='a'){
           return skip1(up.substring(1));
        }
        else {
            return ch + skip1(up.substring(1));
        }
    }

    static String skipApple(String up){
        if(up.isEmpty()){
            return "";
        }
        if (up.startsWith("apple")){
            return skipApple(up.substring(5));
        }
        else {
            return up.charAt(0)+ skipApple(up.substring(1));
        }
    }

    static String skipApp(String up){
        if(up.isEmpty()){
            return "";
        }
        if (up.startsWith("app") && !up.startsWith("apple")){
            return skipApp(up.substring(3));
        }
        else {
            return up.charAt(0)+ skipApp(up.substring(1));
        }
    }

}