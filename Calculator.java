// Calculator.java
// Demonstrates different types of Java operators.

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Accept two integers from the user
        System.out.print("Enter the first integer: ");
        int firstNumber = input.nextInt();

        System.out.print("Enter the second integer: ");
        int secondNumber = input.nextInt();

        // Arithmetic operators
        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;
        int division = firstNumber / secondNumber;
        int remainder = firstNumber % secondNumber;

        System.out.println("\nResults");
        System.out.println("-------");
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
        System.out.println("Remainder: " + remainder);

        // Relational operator
        boolean firstIsGreater = firstNumber > secondNumber;
        System.out.println("First number is greater: " + firstIsGreater);

        // Logical operator
        boolean bothPositive = (firstNumber > 0) && (secondNumber > 0);
        System.out.println("Both numbers are positive: " + bothPositive);

        // Assignment operator
        int result = 0;
        result += firstNumber;
        result += secondNumber;
        System.out.println("Result using assignment operator: " + result);

        // Ternary operator
        String equality = (firstNumber == secondNumber) ? "Equal" : "Not Equal";
        System.out.println("Numbers are: " + equality);

        // Bitwise operator
        int bitwiseResult = firstNumber & secondNumber;
        System.out.println("Bitwise AND: " + bitwiseResult);

        input.close();
    }
}
