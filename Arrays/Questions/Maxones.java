package org.example.Arrays.Questions;

public class Maxones {
    public int findMaxConsecutiveOnes(int[] nums){
        int count=0;
        int max=0;
        for(int num:nums){
            if(num==1){
                count=count+1;
                max=Math.max(max,count);
            }
            else{
                count=0;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        Maxones obj=new Maxones();
        System.out.println(obj.findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1}));
        System.out.println(obj.findMaxConsecutiveOnes(new int[]{1,0,1,1,0,1}));

    }
}
