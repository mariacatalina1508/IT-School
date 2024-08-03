package session_18.challenge.challenge_9;

import java.util.ArrayList;
import java.util.List;
public class OddNumberFilterExample {

    public static void main(String[] args) {
        OddNumberFilter oddNumberFilter = numbers -> {
            List<Integer> result = new ArrayList<>();
            for (Integer number : numbers) {
                if (number % 2 != 0) {
                    result.add(number);
                }
            }

            return result;
        };

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> oddNumbers = oddNumberFilter.filterOddNumbers(numbers);

        System.out.println("Original list: " + numbers);
        System.out.println("Odd numbers: " + oddNumbers);
    }
}
