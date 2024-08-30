package org.example.Arrays.Questions;


public class TicToe {
    public String tictactoe(int[][] moves) {
        String[][] str = new String[3][3];
        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < moves[i].length - 1; j++) {
                if (i % 2 == 0) {
                    str[moves[i][j]][moves[i][j + 1]] = "A";
                } else {
                    str[moves[i][j]][moves[i][j + 1]] = "B";
                }
            }
        }
        int diagacount = 0;
        int diagbcount = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = i; j <= i; j++) {
                if (str[i][j] != null) {
                    if (str[i][j].equals("A")) {
                        diagacount++;
                    } else if (str[i][j].equals("B")) {
                        diagbcount++;
                    }
                }
            }
        }
        if(diagacount==3){

            return "A";
        }
        if (diagbcount==3) {

            return "B";
        }
        int revdiagacount = 0;
        int revdiagbcount = 0;
        for (int i = 2; i >=0; i--) {
            for (int j = 2-i; j <= 2-i;j++) {
                if (str[j][i] != null) {
                    if (str[j][i].equals("A")) {
                        revdiagacount++;
                    } else if (str[j][i].equals("B")) {
                        revdiagbcount++;
                    }
                }
            }
        }
        if(revdiagacount==3){

            return "A";
        }
        if (revdiagbcount==3) {

            return "B";
        }
        int rowacount = 0;
        int rowbcount = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (str[i][j] != null) {
                    if (str[i][j].equals("A")) {
                        rowacount++;
                    } else if (str[i][j].equals("B")) {
                        rowbcount++;
                    }
                }
            }
            if(rowacount!=3){
                rowacount=0;
            }
            else{
                return "A";
            }
            if (rowbcount!=3) {
                rowbcount=0;

            }
            else{
                return "B";
            }
        }
        int colacount = 0;
        int colbcount = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (str[j][i] != null) {
                    if (str[j][i].equals("A")) {
                        colacount++;
                    } else if (str[j][i].equals("B")) {
                        colbcount++;
                    }
                }
            }
            if(colacount!=3){
                colacount=0;
            }
            else{
                return "A";
            }
            if (colbcount!=3) {
                colbcount=0;
            }
            else{
                return "B";
            }
        }
        if(moves.length == 9){
            return "Draw";
        }
        return "Pending";
    }
    public static void main(String[] args) {
        TicToe obj=new TicToe();
        System.out.println(obj.tictactoe(new int[][]{{1,2},{2,1},{0,0},{0,1},{2,0},{0,2},{2,2},{1,1}}));
    }
}
