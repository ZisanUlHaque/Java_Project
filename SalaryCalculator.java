//7. Write a program to calculate an employee's salary after deductions based on certain conditions. 
//Handle exceptions such as invalid salary input or deduction exceeding salary.
package Project;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        try {
            // Input employee salary
            System.out.print("Enter the employee's salary: $");
            double salary = s.nextDouble();
            if (salary <= 0) {
                System.out.println("Error: Salary must be greater than 0.");
                return;
            }

            // Input deductions
            System.out.print("Enter the total deductions: $");
            double deductions = s.nextDouble();
            if (deductions < 0) {
                System.out.println("Error: Deduction cannot be negative.");
                return;
            }
            if (deductions > salary) {
                System.out.println("Error: Deduction cannot exceed the salary.");
                return;
            }

            // Calculate and display net salary
            double netSalary = salary - deductions;
            System.out.println("The employee's net salary is: $" + netSalary);

        } catch (Exception e) {
            System.out.println("Error: Please enter valid numbers.");
        } finally {
            s.close();
        }
    }
}



