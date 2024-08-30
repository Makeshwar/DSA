package org.example.Arrays.Questions;

public class CountPairs {
    public int countKDifference(int[] nums, int k) {
        int diff=0;
        int i=0;
        int j=1;
        while(i<nums.length-1){
            if(Math.abs(nums[i]-nums[j])==k){
                diff++;
            }
            j++;
            if(j==nums.length){
                i++;
                j=i+1;
            }
        }
        return diff;
    }

    public static void main(String[] args) {
        CountPairs obj=new CountPairs();
        System.out.println(obj.countKDifference(new int[]{3,2,1,5,4},2));
    }
}
