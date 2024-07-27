package org.example.Arrays;

public class MaxPartition {
    public static int maxSubarrays(int[] arr) {
        int totalProduct = 1;
        for (int num : arr) {
            totalProduct *= num;
        }
        int maxPartitions = -1;
        // Try every possible product that divides totalProduct
        for (int targetProduct = 1; targetProduct <= totalProduct; targetProduct++) {
            if (totalProduct % targetProduct == 0) {
                int subarraysFormed = canPartition(arr, targetProduct);
                if (subarraysFormed >= 2) {
                    maxPartitions = Math.max(maxPartitions, subarraysFormed);
                }
            }
        }
        return maxPartitions;
    }

    private static int canPartition(int[] arr, int targetProduct) {
        int currentProduct = 1;
        int subarraysFormed = 0;
        for (int num : arr) {
            currentProduct *= num;
            if (currentProduct == targetProduct) {
                subarraysFormed++;
                currentProduct = 1; // Reset for the next subarray
            }
            else if (currentProduct > targetProduct) {
                return -1;
            }
        }
        return subarraysFormed;
    }

    public static void main(String[] args) {
        int[] arr = {36, 6, 6, 3, 12};
        System.out.println(maxSubarrays(arr));  // Expected output: 3
    }
}