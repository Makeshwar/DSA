package org.example;

public class Chocolates {

        public static int minBoxesRequired(int chocolatesPerBox, int chocolatesNeededPerDay, int totalDays) {
            // Calculate total chocolates required to survive
            int totalChocolatesRequired = chocolatesNeededPerDay * totalDays;

            // Calculate the number of Sundays (days you don't receive a box)
            int numberOfSundays = totalDays / 7;

            // Calculate the number of days you can receive boxes (i.e., non-Sundays)
            int daysYouReceiveBoxes = totalDays - numberOfSundays;

            // Calculate the total chocolates you can receive
            int totalChocolatesAvailable = chocolatesPerBox * daysYouReceiveBoxes;

            // If you cannot receive enough chocolates, return -1 (indicating survival is impossible)
            if (totalChocolatesAvailable < totalChocolatesRequired) {
                return -1;
            }

            // Otherwise, calculate the minimum number of boxes required
            int minBoxesRequired = (int) Math.ceil((double) totalChocolatesRequired / chocolatesPerBox);

            return minBoxesRequired;
        }

        public static void main(String[] args) {
            // Example Input
            int chocolatesPerBox = 16;  // Number of chocolates per box (Input1)
            int chocolatesNeededPerDay = 2;  // Number of chocolates needed per day (Input2)
            int totalDays = 10;  // Total number of days to survive (Input3)

            // Calculate and output the minimum number of boxes required
            int result = minBoxesRequired(chocolatesPerBox, chocolatesNeededPerDay, totalDays);
            if (result == -1) {
                System.out.println("Survival is not possible");
            } else {
                System.out.println("Minimum boxes required: " + result);
            }

    }
}
