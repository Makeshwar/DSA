package org.example.Recursion;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
        dice("",4);
        System.out.println(diceret("",4));
        System.out.println(dicesumcount(2,6,7));

    }

    static void dice(String p,int target){
        if(target==0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <=6 && i<=target; i++) {
            dice(p+i,target-i);
        }
    }

    static int dicesumcount(int n, int k, int target) {
        // Base case: If we have no dice left and the target is 0, we have found a valid way.
        if (n == 0) {
            return target == 0 ? 1 : 0;
        }

        // If the target is negative or we've exhausted all dice without achieving the target
        if (target < 0 || n < 0) {
            return 0;
        }

        int count = 0;
        // Try every face value from 1 to k
        for (int i = 1; i <= k && i <= target; i++) {
            count += dicesumcount(n - 1, k, target - i);
        }

        return count;
    }
    static ArrayList<String> diceret(String p, int target){
        if (target==0){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list=new ArrayList<>();

        for (int i = 1; i <=6 && i<=target; i++) {
            list.addAll(diceret(p+i,target-i));
        }
        return list;
    }
}
