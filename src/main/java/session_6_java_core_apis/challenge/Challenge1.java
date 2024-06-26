package session_6_java_core_apis.challenge;

import java.util.Scanner;

public class Challenge1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        StringBuilder reversed = new StringBuilder(input);
        reversed.reverse();

        System.out.println("Reversed string: " + reversed.toString());
    }
}
