package org.example.Recursion.Search;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={23,45,65,32,21,68,98};
        int target=32;
        System.out.println(search(arr,target,0));
        System.out.println(search1(arr,target,0));
        System.out.println(searchlast(arr,target, arr.length-1));
    }

    public static boolean search(int[] num,int target,int index){
        if(index==num.length){
            return false;
        }
       return num[index]==target || search(num,target,index+1);
    }
    public static int search1(int[] num,int target,int index){
        if(index==num.length){
            return -1;
        }
        if(num[index]==target){
            return index;
        }
        else{
            return search1(num,target,index+1);
        }
    }
    public static int searchlast(int[] num,int target,int index){
        if(index==-1){
            return -1;
        }
        if(num[index]==target){
            return index;
        }
        else{
            return searchlast(num,target,index-1);
        }
    }
}
