package org.example;

import java.util.HashSet;
import java.util.Set;

public class ArithmeticTriplets {
    public int arithmeticTriplets(int[] nums, int diff) {
        Set<Integer> numSet = new HashSet<>();
        int count = 0;

        // Add all elements to the set
        for (int num : nums) {
            numSet.add(num);
        }

        // Check for each num if num + diff and num + 2 * diff exist
        for (int num : nums) {
            if (numSet.contains(num + diff) && numSet.contains(num + 2 * diff)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        ArithmeticTriplets obj=new ArithmeticTriplets();
        System.out.println(obj.arithmeticTriplets(new int[]{0,1,4,6,7,10},3));
    }
}