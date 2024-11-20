//2. Write a program to store and calculate grades for students. 
//The program should read marks from the user, calculate the grade, and handle invalid inputs.
package Project;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter marks (out of 100): ");
            int marks = sc.nextInt();

            // Validate marks
            if (marks < 0 || marks > 100) {
                System.out.println("Marks must be between 0 and 100.");
            } else {
                // Calculate grade using ternary operator
                String grade = (marks >= 80) ? "A+" :
                               (marks >= 70) ? "A" :
                               (marks >= 60) ? "B" :
                               (marks >= 50) ? "C" :
                               (marks >= 40) ? "D" : "F";
                System.out.println("Grade: " + grade);
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid number.");
        } finally {
            sc.close();  // Ensure the scanner is closed
        }
    }
}
