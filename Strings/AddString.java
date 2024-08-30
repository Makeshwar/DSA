package org.example.Strings;

public class AddString {
    public String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        while (i >= 0 || j >= 0 || carry > 0) {
            int n1 = i >= 0 ? num1.charAt(i) - '0' : 0;  // Convert character to integer
            int n2 = j >= 0 ? num2.charAt(j) - '0' : 0;  // Convert character to integer
            int sum = n1 + n2 + carry;
            carry = sum / 10;  // Determine the carry for the next iteration
            result.append(sum % 10);  // Append the digit to the result
            i--;
            j--;
        }
        return result.reverse().toString();
    }
    public static void main(String[] args) {
        AddString io = new AddString();
        System.out.println(io.addStrings("123","31"));

    }
}
