package session_18.challenge.challenge_3;

import java.util.Arrays;
import java.util.List;

public class SumOfElements {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(11, 12, 13, 14, 15, 16, 17, 18, 19, 20);

        int sum = numbers.stream()
                .reduce(0, (a, b) -> a + b);

        System.out.println("Sum of all element in array: " + sum);
    }
}