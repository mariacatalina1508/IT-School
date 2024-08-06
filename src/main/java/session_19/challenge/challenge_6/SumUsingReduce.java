package session_19.challenge.challenge_6;

import java.util.Arrays;

public class SumUsingReduce {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};

        int sum = Arrays.stream(numbers)
                .reduce(0, (a, b) -> a + b);

        System.out.println("Sum of all integers: " + sum);
    }
}