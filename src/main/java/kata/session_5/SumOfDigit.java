package kata.session_5;

import java.util.Scanner;

public class SumOfDigit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        String result = Integer.toString(number);
        int sum = 0;

        //FIRST METHOD
        for (int index = 0; index < result.length(); index++) {
            sum += Character.getNumericValue(result.charAt(index));
        }

        System.out.println(sum);
        scanner.close();

        //SECOND METHOD
//        while (number > 0) {
//            int num = number % 10;
//            sum += num;
//            number = number / 10;
//        }
    }
}