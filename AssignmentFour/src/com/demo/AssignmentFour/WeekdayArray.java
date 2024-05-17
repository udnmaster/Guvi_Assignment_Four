package com.demo.AssignmentFour;

import java.util.Scanner;

public class WeekdayArray {
    public static void main(String[] args) {
        // Array containing names of weekdays
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter day position
        System.out.print("Enter the day position (0-6): ");
        int dayPosition = scanner.nextInt();

        try {
            // Print the day name
            String dayName = weekdays[dayPosition];
            System.out.println("Day name: " + dayName);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle array index out of bound exception
            System.out.println("Invalid day position. Please enter a number between 0 and 6.");
        }

        scanner.close();
    }
}
