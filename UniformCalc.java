package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniformCalc {
    // Define the colors in a cycle order
    private static final List<String> COLORS = Arrays.asList("Red", "Green", "Yellow", "White");

    public static List<String> calculateUniformColors(String initialColor, int joiningYear) {
        List<String> result = new ArrayList<>();
        int startIndex = COLORS.indexOf(initialColor);

        // Calculate the start year of the student's grade
        int startYear = joiningYear;

        // Determine the base index for grades 6 to 10
        int initialGradeIndex = 6;
        int offset = (startYear - 2010) % 3; // Offset for the joining year

        // Calculate colors for grades 6 to 10
        for (int year = initialGradeIndex; year <= 10; year++) {
            int colorIndex = (startIndex + (year - initialGradeIndex) / 3) % COLORS.size();
            result.add(COLORS.get(colorIndex));
        }

        // Determine the colors for grades 11 and 12
        int lastColorIndex = (startIndex + (10 - initialGradeIndex) / 3) % COLORS.size();
        int nextColorIndex = (lastColorIndex + 1) % COLORS.size();

        // Ensure different color for grades 11 and 12
        while (COLORS.get(nextColorIndex).equals(result.get(4))) {
            nextColorIndex = (nextColorIndex + 1) % COLORS.size();
        }

        // Add colors for grades 11 and 12
        result.add(COLORS.get(nextColorIndex)); // Grade 11
        result.add(COLORS.get((nextColorIndex + 1) % COLORS.size())); // Grade 12

        return result;
    }

    public static void main(String[] args) {
        String initialColor = "Green"; // Example input
        int joiningYear = 3100; // Example input

        List<String> uniformColors = calculateUniformColors(initialColor, joiningYear);

        // Print the uniform colors for grades 6 to 12
        for (int grade = 6; grade <= 12; grade++) {
            System.out.println("Grade " + grade + ": " + uniformColors.get(grade - 6));
        }
    }
}
