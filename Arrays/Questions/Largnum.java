package org.example.Arrays.Questions;

public class Largnum {
    public int dominantIndex(int[] nums) {
        int first = Integer.MIN_VALUE;   // Largest element
        int second = Integer.MIN_VALUE;  // Second largest element

        for (int num : nums) {
            if (num > first) {
                // Update both first and second
                second = first;
                first = num;
            } else if (num > second && num != first) {
                // Update only second if num is less than first but greater than second
                second = num;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==first){
                if(first>=2*second){
                    return i;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Largnum obj= new Largnum();
        System.out.println(obj.dominantIndex(new int[]{3,6,1,0}));
    }
}
