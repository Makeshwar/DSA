package org.example.Recursion.Search;

import java.util.ArrayList;

public class LinearSearchOnMul {
    public static void main(String[] args) {
        int[] arr={23,45,65,32,21,68,32,98,21,98,21,21};
        int target=21;
//        search(arr,target,0);
//        System.out.println(li);
        System.out.println(search1(arr,target,0,li));
    }
    static ArrayList<Integer> li = new ArrayList<>();

    //void function
    public static void search(int[] num, int target, int index){
        if(index==num.length){
            return;
        }
        if(num[index]==target) {
            li.add(index);
        }
        search(num,target,index+1);
    }

    //return list function
    public static ArrayList<Integer> search1(int[] num, int target, int index,ArrayList<Integer> list ){
        if(index==num.length){
            return list;
        }
        if(num[index]==target) {
            list.add(index);
        }
        return search1(num,target,index+1,list);
    }
}
