package org.example.Arrays.Questions;

import java.util.Arrays;

public class Maxnegint {
    public static   int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int maxK = -1;

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            if (nums[left] == -nums[right]) {
                maxK = Math.max(maxK, nums[right]);
                left++;
                right--;
            } else if (Math.abs(nums[left]) < Math.abs(nums[right])) {
                right--;
            } else {
                left++;
            }
        }

        return maxK;
    }

    public static void main(String[] args) {
        int[] arr={-9,-43,24,-23,-16,-30,-38,-30};
        System.out.println(findMaxK(arr));;
    }
    }

