package session_18.challenge.challenge_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumberFilter {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(11, 12, 13, 14, 15, 16, 17, 18, 19, 20);

        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Even numbers: " + evenNumbers);
    }
}
