package session_6_java_core_apis.challenge;

import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        StringBuilder reversed = new StringBuilder(input);
        reversed.reverse();

        if (input.equalsIgnoreCase(reversed.toString())) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}
