package org.example.Arrays.Questions;
import java.util.Scanner;
public class LiftPosition {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("number of lifts: ");
            int numLifts = sc.nextInt();
            int[] lifts = new int[numLifts];
            System.out.print("initial positions of the lifts: ");
            for (int i = 0; i < numLifts; i++) {
                lifts[i] = sc.nextInt();
            }
            System.out.print("number of lift calls: ");
            int numCalls = sc.nextInt();
            int[] calls = new int[numCalls];
            System.out.print("lift calls: ");
            for (int i = 0; i < numCalls; i++) {
                calls[i] = sc.nextInt();
            }
            for (int call : calls) {
                int chosenLift = chooseLift(lifts, call);
                lifts[chosenLift] = call;
            }
            System.out.println("Final positions of lifts:");
            for (int i = 0; i < numLifts; i++) {
                System.out.println("Lift " + (char) ('A' + i) + ": " + lifts[i]);
            }
        }
        public static int chooseLift(int[] lifts, int call) {
            int nearestLift = -1;
            int minDistance = Integer.MAX_VALUE;
            for (int i = 0; i < lifts.length; i++){
                int distance = Math.abs(lifts[i] - call);
                if (distance < minDistance || (distance == minDistance && (nearestLift == -1 || lifts[i] < lifts[nearestLift]))){
                    nearestLift = i;
                    minDistance = distance;
                }
            }
            return nearestLift;
        }
    }