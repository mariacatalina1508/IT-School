package session_4_java_operators_and_loops_challenges;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
         /* 4. Write a Java program where you declare two integer variables heightOne and heightTwo with any values.
        Use a ternary operator to determine the greater height and assign it to a variable maximumHeight. Print the result. */
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter the first heigh:");
        int h1 = sc.nextInt();
        System.out.println("Please, enter the second heigh: ");
        int h2 = sc.nextInt();

        int maximumHeigh = h1 > h2 ? h1 : h2;
        String maximumHeight;
        System.out.println("The maximum height is " + maximumHeight);
    }
}
