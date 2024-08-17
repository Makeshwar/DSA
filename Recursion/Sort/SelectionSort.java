package org.example.Recursion.Sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] num={3367,75,76,456,34,87};
        selectionsort(num, num.length,0,0);
        System.out.println(Arrays.toString(num));

    }
    static  void selectionsort(int[] arr, int row, int col,int max) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            if (arr[col] > arr[max]) {
                selectionsort(arr, row, col + 1,col);

            }
            else {
                selectionsort(arr, row, col + 1,max);
            }
        }
        else{
            int temp=arr[max];
            arr[max]=arr[row-1];
            arr[row-1]=temp;
            selectionsort(arr, row - 1, 0,0);
        }
    }
}
