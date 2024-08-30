package org.example.Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class ThirdMax {
    public static int thirdMax(int[] nums) {
        int firstMax = 0;
        int secondMax = 0;
        int thirdMax = 0;
        // Traverse through the array
        for (Integer num : nums) {
            // Skip if num is already considered as a max
            if (num.equals(firstMax) || num.equals(secondMax) || num.equals(thirdMax)) {
                continue;
            }
            // Update firstMax, secondMax, and thirdMax accordingly
            if (firstMax == 0 || num > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = num;
            } else if (secondMax == 0 || num > secondMax) {
                thirdMax = secondMax;
                secondMax = num;
            } else if (thirdMax == 0 || num > thirdMax) {
                thirdMax = num;
            }
        }
        String s="123";
       long n1= Integer.parseInt(s);

        // If thirdMax is not set, return firstMax
        return (thirdMax == 0) ? firstMax : thirdMax;

    }

    public static void main(String[] args) {
        System.out.println(thirdMax(new int[]{3, 2, 1}));
    }
}
