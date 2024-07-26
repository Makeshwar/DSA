package org.example.Sort.Questions;

import java.util.Arrays;
import java.util.Map;

import java.util.TreeMap;

public class Sortpeople {
    public static void main(String[] args) {
        String[] people={"Alice","Bob","Bob"};
        int[] heights={155,185,150};
        System.out.println(Arrays.toString(sortPeople(people,heights)));
    }
    public static String[] sortPeople(String[] names,int[] heights){
        {
            Map<Integer, String> map = new TreeMap<>();
            String res[] = new String[names.length];
            for(int i=0; i<names.length; i++)
            {
                map.put(heights[i],names[i]);
            }
            int j = names.length-1;
            for(Map.Entry<Integer,String> m : map.entrySet()){
                res[j--] = m.getValue();
            }
            return res;
        }
    }
}