package org.example.Search;

public class Richcus {
    public static void main(String[] args) {
        int[][] accounts={
                {1,2,3},
                {3,2,1}
        };
        System.out.println(maximumWealth(accounts));
    }
    public static int maximumWealth(int[][] accounts){
        int max=0;
        for (int person = 0; person < accounts.length; person++) {
            int rowsum=0;
            for (int account = 0; account < accounts[person].length; account++) {
                rowsum+=accounts[person][account];
            }
            if (rowsum>max){
                max=rowsum;
            }
        }
        return max;
    }
}
