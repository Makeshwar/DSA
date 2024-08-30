package org.example;

import java.util.Stack;

public class Baseball {
    public int calPoints(String[] operations) {
        Stack<Integer> li = new Stack<>();
        int sum = 0;


        for (String s : operations) {
            if (!s.equals("+") && !s.equals("D") && !s.equals("C")) {
                // Handle normal integer inputs
                li.push(Integer.parseInt(s));
            } else if (s.equals("C")) {
                // Remove the last score
                li.pop();
            } else if (s.equals("D")) {
                // Double the last score and add it to the stack
                li.push(li.peek() * 2);
            } else if (s.equals("+")) {
                // Calculate the sum of the last two scores
                int lastElement = li.pop(); // Get the last element
                int secondLastElement = li.pop(); // Get the second last element

                // Push them back to preserve the order
                li.push(secondLastElement);
                li.push(lastElement);

                // Push the sum of the last two elements
                li.push(secondLastElement + lastElement);
            }
        }

        // Calculate the sum of all elements in the stack
        for (int n : li) {
            sum += n;
        }


        return sum;
    }

    public static void main(String[] args) {
        Baseball b=new Baseball();
        System.out.println(b.calPoints(new String[]{"1","C"}));
    }
}
