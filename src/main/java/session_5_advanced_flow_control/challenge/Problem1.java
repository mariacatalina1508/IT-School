package session_5_advanced_flow_control.challenge;

import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args ) {
        /* 1. Even or Odd Checker. Write a Java program that takes an integer as input.
        If the number is even, print "Even". If it's odd, print "Odd".*/
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter a number: ");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
