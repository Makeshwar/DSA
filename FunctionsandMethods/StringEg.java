package org.example.FunctionsandMethods;

import java.util.Scanner;

public class StringEg {

    public static void main(String[] args) {
        String message = greet();
        System.out.println(message);

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name: ");
        String peyar=sc.next();
        String personalised= myGreet(peyar);
        System.out.println(personalised);
    }

    static String myGreet(String name) {
        String message="Hello "+ name;
        return message;
    }

    static String greet(){
        String greeting="Hello";
        return greeting;
    }
}
