package org.example.Arrays.Questions;

import java.util.HashMap;

public class ContainDup {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int previousIndex = map.get(nums[i]);
                if (i - previousIndex <= k) {
                    return true;
                }
            }
            map.put(nums[i], i); // Update the index of the current element
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr={1,0,1,1};
        System.out.println(containsNearbyDuplicate(arr,1));
    }
}
