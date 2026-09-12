// StudentMarksScanner.java
// Reads student information using the Scanner class.

import java.util.Scanner;

public class StudentMarksScanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Get student information
        System.out.print("Enter student name: ");
        String name = input.nextLine();

        System.out.print("Enter registration number: ");
        String registrationNumber = input.nextLine();

        System.out.print("Enter marks for Subject 1: ");
        int mark1 = input.nextInt();

        System.out.print("Enter marks for Subject 2: ");
        int mark2 = input.nextInt();

        System.out.print("Enter marks for Subject 3: ");
        int mark3 = input.nextInt();

        // Calculate total and average
        int totalMarks = mark1 + mark2 + mark3;
        double averageMark = totalMarks / 3.0;

        // Determine whether the student passed
        boolean passed = averageMark >= 50;

        // Display results
        System.out.println("\nStudent Results");
        System.out.println("---------------");
        System.out.println("Student Name: " + name);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Mark: " + averageMark);

        if (passed) {
            System.out.println("Result: PASSED");
        } else {
            System.out.println("Result: FAILED");
        }

        input.close();
    }
}
