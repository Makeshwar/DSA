package org.example.Strings;

public class OptimalPart {
    public int partitionString(String s) {
        int partition=1;
        StringBuilder str=new StringBuilder();
        for(char c:s.toCharArray()){
            if (str.indexOf(String.valueOf(c))==-1){
                str.append(c);
            } else if (s.indexOf(c)!=-1) {
                partition++;
                str.setLength(0);
                str.append(c);
            }

        }
        return partition;


    }

    public static void main(String[] args) {
        OptimalPart obj=new OptimalPart();
        System.out.println(obj.partitionString("ssssss"));
    }
}
