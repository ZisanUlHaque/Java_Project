//1. Write a program to implement a simple calculator with basic operations (addition, subtraction, multiplication, and division). 
//The program should handle invalid input and exceptions, such as dividing by zero or entering non-numeric characters.

package Project;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter operator (+, -, *, /): ");
            char operator = sc.next().charAt(0);

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            double result;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("Cannot divide by zero.");
                        sc.close();
                        return;
                    }
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Invalid operator.");
                    sc.close();
                    return;
            }

            System.out.println("Result: " + result);

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter numbers only.");
        }

        sc.close();
    }
}

