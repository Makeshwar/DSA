package org.example.Arrays.Questions;

public class PivotIndex {
    public int pivotIndex(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int lsum = nums[start];
        int rsum = nums[end];

        while (start < end) {
            if (lsum > rsum) {
                end--;
                rsum += nums[end];
            } else if (lsum < rsum) {
                start++;
                lsum += nums[start];
            }

            // Check if sums are equal and there's exactly one element in between
            if (lsum == rsum && (end - start) == 2) {
                return (start + end) / 2;
            } else if (lsum == rsum && (end - start) == 1) {
                return -1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        PivotIndex obj=new PivotIndex();
        System.out.println(obj.pivotIndex(new int[]{1,2,3}));

    }
}
