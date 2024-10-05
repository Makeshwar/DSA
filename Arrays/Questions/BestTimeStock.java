package org.example.Arrays.Questions;

public class BestTimeStock {
    public static int maxProfit(int[] prices) {
        int currmin = 0;
        int i = 0;
        int j = i + 1;
        while (i < prices.length - 1 ){
            if (prices[i] - prices[j] > currmin) {
                j++;
                if (j==prices.length){
                    i++;
                    j=i+1;
                }
            } else if (prices[i] - prices[j] <= currmin) {
                currmin = Math.min(currmin, prices[i] - prices[j]);
                j++;
                if (j==prices.length){
                    i++;
                    j=i+1;
                }
            }
        }
        return Math.abs(currmin);
    }
    public static void main(String[] args) {
        int[] arr={3,3};
        System.out.println(maxProfit(arr));
    }
}
