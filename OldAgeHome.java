//6. Suppose you are launching an old age home. 
//For your home you are developing a software who can decide that the parents are allowed to your home or not. 
//Now write a java program which can solve this problem.
package Project;

import java.util.Scanner;

class OldAgeHome {
    public boolean isEligible(int age, boolean needsSupport) {
        // Criteria: Age should be 60 or above and should not need extensive medical support.
        return age >= 60 && needsSupport == false;
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        OldAgeHome oldAgeHome = new OldAgeHome();

        System.out.println("Welcome to Old Age Home Admission System");

        // Input applicant details
        System.out.print("Enter the applicant's name: ");
        String name = s.nextLine();

        System.out.print("Enter the applicant's age: ");
        int age = s.nextInt();

        System.out.print("Does the applicant require extensive medical support? (true/false): ");
        boolean needsSupport = s.nextBoolean();

        // Check eligibility
        if (oldAgeHome.isEligible(age, needsSupport)) {
            System.out.println("Congratulations " + name + ", you are eligible to join the old age home.");
        } else {
            System.out.println("Sorry " + name + ", you are not eligible to join the old age home.");
        }
        s.close();
    }
}
