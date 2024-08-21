package org.example.Arrays;

import java.util.HashSet;

public class Dupele {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> un = new HashSet<>();
        for (int num: nums){
            if(!un.add(num)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,1};
        System.out.println(containsDuplicate(arr));
    }
}
