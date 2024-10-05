package org.example.Arrays.Questions;

import java.util.ArrayList;
import java.util.List;

public class SelfDivide {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> li = new ArrayList<>();

        for(int i=left;i<=right;i++){
            boolean flag=true;
            int num=i;
            while(num>0){
                int rem=num%10;
                if(rem==0){
                    flag=false;
                }
                else   if(i%rem!=0  ){
                    flag=false;
                }
                num=num/10;
            }
            if(flag){
                li.add(i);
            }
        }
        return li;
    }

    public static void main(String[] args) {
        SelfDivide obj= new SelfDivide();
        System.out.println(obj.selfDividingNumbers(47,85));
    }
}
