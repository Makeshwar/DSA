package org.example.BitManipulation;

public class Numcomp {
    public static int findComplement(int num) {

        String n=Integer.toBinaryString(num);
        StringBuilder res= new StringBuilder();
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i)=='0'){
                res.append("1");
            }
            else{
                res.append("0");
            }
        }
        return Integer.parseInt(res.toString(),2);
    }

    public static void main(String[] args) {
        System.out.println(findComplement(5));
    }
}
