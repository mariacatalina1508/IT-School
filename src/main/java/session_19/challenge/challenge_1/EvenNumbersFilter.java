package session_19.challenge.challenge_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbersFilter {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 4, 7, 8, 12, 15);

        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Original list: " + numbers);
        System.out.println("Even numbers: " + evenNumbers);
    }
}
