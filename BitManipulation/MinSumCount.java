package org.example.BitManipulation;

public class MinSumCount {
        public static int minBinarySums(int target) {
            int count = 0;
            while (target > 0) {
                count += target & 1; // Add 1 if the least significant bit is 1
                target >>= 1; // Right shift the target by 1 bit
            }
            return count;
        }

        public static void main(String[] args) {
            int target = 32;
            System.out.println(minBinarySums(target));
        }

}
