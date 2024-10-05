package org.example.Strings;

public class RevStr {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray(); // Convert string to character array
        int n = s.length();

        // Process each 2k block
        for (int start = 0; start < n; start += 2 * k) {
            int end = Math.min(start + k - 1, n - 1); // Calculate the end of the segment to reverse
            reverse(arr, start, end); // Reverse the current k characters
        }

        return new String(arr); // Convert character array back to string
    }

    // Helper method to reverse a segment of the array
    private void reverse(char[] arr, int left, int right) {
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        RevStr obj=new RevStr();
        System.out.println(obj.reverseStr("hello",4));
    }
}
