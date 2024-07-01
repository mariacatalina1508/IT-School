package session_8_recap.challenge;

import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.println("Enter the first number: ");
            double number1 = sc.nextDouble();

            System.out.println("Enter the second number: ");
            double number2 = sc.nextDouble();

            System.out.println("Enter the operator(): (+, -, *, /)");
            char operator = sc.next().charAt(0);

            double result = calculate(number1, number2, operator);
            System.out.println("Result: " + result);

            System.out.println("Do you want to perform another calculation? (y/n):");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Exit the program");
    }

    public static double calculate(double num1, double num2, char operator) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 == 0) {
                    System.out.println("Division by zero is not allowed.");
                    return Double.NaN;
                }
                return num1 / num2;
            default:
                return Double.NaN;
        }
    }
}
