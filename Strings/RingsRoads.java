package org.example.Strings;

import java.util.Arrays;

public class RingsRoads {
    public int countPoints(String rings) {
        boolean[] B=new boolean[10];
        boolean[] R=new boolean[10];
        boolean[] G=new boolean[10];

        for(int i=0;i<rings.length();i++){
            if(Character.isLetter(rings.charAt(i))){
                if(rings.charAt(i)=='B'){
                    B[Integer.parseInt(String.valueOf(rings.charAt(i+1)))]=true;
                }
                else if(rings.charAt(i)=='R'){
                    R[Integer.parseInt(String.valueOf(rings.charAt(i+1)))]=true;
                }
                else if(rings.charAt(i)=='G'){
                    G[Integer.parseInt(String.valueOf(rings.charAt(i+1)))]=true;
                }
            }
        }
        int count=0;
        for(int i=0;i<10;i++){
            if(B[i] && G[i] && R[i]){
                count++;

            }
        }

        return count;
    }

    public static void main(String[] args) {
        RingsRoads obj=new RingsRoads();
        System.out.println(obj.countPoints("B0R0G0R9R0B0G0"));
    }
}
