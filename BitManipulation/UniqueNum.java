package org.example.BitManipulation;

public class UniqueNum {
    public static void main(String[] args) {
        int[] arr={2,3,6,8,1,2,6,8,3};
        int unique=0;
        for (int num : arr){
            unique^=num;
        }
        System.out.println(unique);
    }
}
