//10. Create a program that takes a user input (age, salary, etc.) and applies appropriate validation.
//Throw custom exceptions with meaningful messages when validation fails.
package Project;

import java.util.Scanner;

// Custom exception for invalid age
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Custom exception for invalid salary
class InvalidSalaryException extends Exception {
    public InvalidSalaryException(String message) {
        super(message);
    }


    // Method to validate age
    public static int getValidAge() throws InvalidAgeException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Age validation: must be between 18 and 120
        if (age < 18 || age > 120) {
            throw new InvalidAgeException("Age must be between 18 and 120.");
        }
        return age;
    }

    // Method to validate salary
    public static double getValidSalary() throws InvalidSalaryException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();

        // Salary validation: must be positive
        if (salary <= 0) {
            throw new InvalidSalaryException("Salary must be greater than 0.");
        }
        return salary;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Get and validate age
            int age = getValidAge();
            System.out.println("Valid age entered: " + age);

            // Get and validate salary
            double salary = getValidSalary();
            System.out.println("Valid salary entered: $" + salary);

        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InvalidSalaryException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
    }
}

