package org.example.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);
        Scanner sc=new Scanner(System.in);
        list.add(8);
        list.add(7);
        list.add(4);
        list.add(2);
        list.add(5);
        list.add(9);
        list.set(0,99);
        System.out.println(list);
        System.out.println(list.contains(9));
        list.remove(2);
        System.out.println(list);
    }
}
