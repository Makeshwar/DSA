package org.example.Arrays.Questions;

import java.util.ArrayList;
import java.util.List;

public class Kthfactor {
    public int kthFactor(int n, int k) {
        List<Integer> li=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                li.add(i);
            }
        }
        if(k>li.size()) {
            return -1;

        }
        return li.get(k-1);
    }

    public static void main(String[] args) {
        Kthfactor obj=new Kthfactor();
        System.out.println(obj.kthFactor(4,4));
    }
}
