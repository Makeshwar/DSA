package org.example.Arrays;

public class Max_sum {

    public int maxSubArray(int[] nums) {
        int curr_sum=0;
        int max_sum=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            curr_sum+=nums[i];
            max_sum=Math.max(max_sum,curr_sum);
            if(curr_sum<0){
                curr_sum=0;
            }
        }
        return max_sum;
    }

    public static void main(String[] args) {
        Max_sum obj=new Max_sum();
        System.out.println(obj.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}
