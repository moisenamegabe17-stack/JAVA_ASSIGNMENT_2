// StudentMarksBufferedReader.java
// Reads student information using BufferedReader.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class StudentMarksBufferedReader {
    public static void main(String[] args) throws IOException {

        // Create BufferedReader object
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in)
        );

        // Get student information
        System.out.print("Enter student name: ");
        String name = reader.readLine();

        System.out.print("Enter registration number: ");
        String registrationNumber = reader.readLine();

        System.out.print("Enter marks for Subject 1: ");
        int mark1 = Integer.parseInt(reader.readLine());

        System.out.print("Enter marks for Subject 2: ");
        int mark2 = Integer.parseInt(reader.readLine());

        System.out.print("Enter marks for Subject 3: ");
        int mark3 = Integer.parseInt(reader.readLine());

        // Calculate total and average
        int totalMarks = mark1 + mark2 + mark3;
        double averageMark = totalMarks / 3.0;

        // Determine pass or fail
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
    }
}
