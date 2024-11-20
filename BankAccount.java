//3. Design a program to simulate a bank account. 
//The system should allow the user to deposit and withdraw money while handling exceptions.
package Project;

import java.util.Scanner;

public class BankAccount {

    String name, type;
    double amount;

    // Constructor to initialize the account details
    BankAccount() {
        name = "Zisan";
        type = "student";
        amount = 0.0;
    }

    double balance() {
        return amount;
    }

    void deposit(double a) {
        if (a > 0) {
            amount = amount + a;
            System.out.println(a + " taka has been deposited.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    void withdrew(double a) {
        if (amount < a) {
            System.out.println("Insufficient balance.");
        } else if (a > 0) {
            amount = amount - a;
            System.out.println(a + " taka has been withdrawn.");
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create Scanner object for user input

        BankAccount b = new BankAccount();

        try {
            System.out.println("Current amount is " + b.balance());

            System.out.print("Enter amount to withdraw: ");
            double w = sc.nextDouble();
            b.withdrew(w);

            System.out.print("Enter amount to deposit: ");
            double d = sc.nextDouble();
            b.deposit(d);

            System.out.println("Current balance is " + b.balance());

            // Another withdrawal attempt
            System.out.print("Enter amount to withdraw: ");
            w = sc.nextDouble();
            b.withdrew(w);

            // Display final balance
            System.out.println("Final balance is " + b.balance());

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            sc.close();  // Close the scanner object to avoid resource leak
        }
    }
}
