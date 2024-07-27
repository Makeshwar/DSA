package org.example.Arrays.Questions;
import java.util.Scanner;
import java.util.Stack;
public class Pushpop {
    static int pushpop(int n, int[] push, int[] pop) {
        Stack<Integer> stack = new Stack<>();
        int j = 0;
        for (int x : push) {
            stack.push(x);
            while (!stack.isEmpty() && stack.peek() == pop[j]) {
                stack.pop();
                j++;
            }
        }
        return j == n ? 1 : 0;
    }
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
            int[] pushArray=new int[n];
            for (int i=0;i<n;i++) {
                pushArray[i]=sc.nextInt();
            }
            int[] popArray=new int[n];
            for (int i=0;i<n;i++) {
                popArray[i]=sc.nextInt();
            }
        System.out.println(pushpop(n,pushArray, popArray));  // Output: 1

        }

    }

