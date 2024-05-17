package com.demo.AssignmentFour;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentGradeSystem {
    private Map<String, Integer> studentGrades;

    // Constructor
    public StudentGradeSystem() {
        studentGrades = new HashMap<>();
    }

    // Method to add a new student
    public void addStudent(String name, int grade) {
        studentGrades.put(name, grade);
        System.out.println("Student " + name + " added with grade " + grade);
    }

    // Method to remove a student
    public void removeStudent(String name) {
        if (studentGrades.containsKey(name)) {
            studentGrades.remove(name);
            System.out.println("Student " + name + " removed.");
        } else {
            System.out.println("Student " + name + " not found.");
        }
    }

    // Method to display a student's grade by name
    public void displayStudentGrade(String name) {
        if (studentGrades.containsKey(name)) {
            int grade = studentGrades.get(name);
            System.out.println("Grade of student " + name + " is: " + grade);
        } else {
            System.out.println("Student " + name + " not found.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentGradeSystem gradeSystem = new StudentGradeSystem();

        // Adding sample students and grades
        gradeSystem.addStudent("Alice", 85);
        gradeSystem.addStudent("Bob", 90);
        gradeSystem.addStudent("Charlie", 75);

        int choice;
        do {
            System.out.println("\n1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Display Student Grade");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String addName = scanner.next();
                    System.out.print("Enter student grade: ");
                    int addGrade = scanner.nextInt();
                    gradeSystem.addStudent(addName, addGrade);
                    break;
                case 2:
                    System.out.print("Enter student name to remove: ");
                    String removeName = scanner.next();
                    gradeSystem.removeStudent(removeName);
                    break;
                case 3:
                    System.out.print("Enter student name to display grade: ");
                    String displayName = scanner.next();
                    gradeSystem.displayStudentGrade(displayName);
                    break;
                case 4:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
