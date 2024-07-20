package org.example.Search.BinarySearch.Questions;
import java.util.Scanner;
public class Ceilingalph {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] letters = {'c', 'f', 'j'};
        char ch = sc.next().trim().charAt(0);
        System.out.println(ceiling(letters, ch));
    }
    static char ceiling(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (letters[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return letters[start % letters.length];
    }
}