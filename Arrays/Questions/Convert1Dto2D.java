package org.example.Arrays.Questions;

import java.util.Arrays;

public class Convert1Dto2D {
    public static int[][] construct2DArray(int[] original, int m, int n) {

        int[][] arr=new int[m][n];
        int cnt=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(cnt<original.length){
                    arr[i][j]=original[cnt++];
                }
            }
        }
        if (cnt!=original.length-1){
            return new int[][]{};
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr={3};
        System.out.println(Arrays.deepToString(construct2DArray(arr,1,2)));
    }
}
