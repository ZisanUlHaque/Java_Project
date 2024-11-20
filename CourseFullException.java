//11. Write a program for enrolling students in a course. Ensure that each course has a fixed number of seats, 
//and handle exceptions if a student tries to enroll in a full course.
package Project;

import java.util.Scanner;

// Custom exception for full courses
class CourseFullException extends Exception {
    public CourseFullException(String message) {
        super(message);
    }
}

// Course class
class Course {
    private String courseName;
    private int totalSeats;
    private int enrolledStudents;

    public Course(String courseName, int totalSeats) {
        this.courseName = courseName;
        this.totalSeats = totalSeats;
        this.enrolledStudents = 0;
    }

    public String getCourseName() {
        return courseName;
    }

    // Method to enroll a student
    public void enroll() throws CourseFullException {
        if (enrolledStudents < totalSeats) {
            enrolledStudents++;
            System.out.println("Enrolled in " + courseName + " successfully.");
        } else {
            throw new CourseFullException(courseName + " is full.");
        }
    }

    // Method to get available seats
    public int availableSeats() {
        return totalSeats - enrolledStudents;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a couple of courses
        Course javaCourse = new Course("Java Programming", 2);
        Course pythonCourse = new Course("Python Programming", 1);

        while (true) {
            System.out.println("\nCourses Available:");
            System.out.println("1. " + javaCourse.getCourseName() + " - Seats Left: " + javaCourse.availableSeats());
            System.out.println("2. " + pythonCourse.getCourseName() + " - Seats Left: " + pythonCourse.availableSeats());
            System.out.println("0. Exit");
            System.out.print("Choose a course to enroll (0 to exit): ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Exiting...");
                break;
            }

            try {
                if (choice == 1) {
                    javaCourse.enroll();
                } else if (choice == 2) {
                    pythonCourse.enroll();
                } else {
                    System.out.println("Invalid option. Try again.");
                }
            } catch (CourseFullException e) {
                System.out.println(e.getMessage());
            }
        }

        scanner.close();
    }
}
