package org.example.Backtracking;

public class Maze
{
    public static void main(String[] args) {

        count(3,3);
        System.out.println(count(3,3));

    }
    static int count(int row,int col){
        if (row==1||col==1){
            return 1;
        }
        int left=count(row-1,col);
        int right=count(row,col-1);

        return left+right;
    }

}