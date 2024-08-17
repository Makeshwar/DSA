package org.example.Iteration.Subset;

import java.util.ArrayList;
import java.util.List;

public class Subset {
    public static void main(String[] args) {

        int[] arr={1,2,2};
        System.out.println(subset(arr));
        List<List<Integer>> list = subset(arr);
        for (List<Integer> li : list){
            System.out.println(li);
        }
    }
    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num: arr){
            int n=outer.size();
            for (int i = 0; i < n; i++) {
                ArrayList<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }
}
