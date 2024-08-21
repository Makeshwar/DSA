package org.example.BitManipulation;

import java.math.BigInteger;

public class HamDist {
    public static int hammingDistance(int x, int y){
        int xor = x ^ y;

        // Count the number of 1's in the binary representation of xor
        int distance = 0;
        while (xor != 0) {
            distance += xor & 1; // Add 1 if the least significant bit is 1
            xor = xor >> 1;       // Shift xor to the right by 1 bit
        }
        return distance;
    }
    public static void main(String[] args) {
        System.out.println(hammingDistance(1,4));
    }
}
