package org.example.Arrays.Questions;

import java.util.ArrayList;

public class Arrayrot {
    public static void main(String[] args) {
        int[] arr={7,7,3,8,6,8,5,4,5};
        int k=3;
        k = k % arr.length;
        arrrot(arr,k);
    }
    static void arrrot(int[] arr,int k){
        for (int i = k; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        for (int j = 0; j < k; j++) {
            System.out.print(arr[j]+" ");
        }
        }
    }

