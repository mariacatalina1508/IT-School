package session_18.challenge.challenge_8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class ListMapperExample {

    public static void main(String[] args) {
        ListMapper mapper = (list, function) -> {
            List<Integer> result = new ArrayList<>();
            for (Integer i : list) {
                result.add(function.apply(i));
            }
            return result;
        };

        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        Function<Integer, Integer> doubleFunction = n -> n * 2;

        Function<Integer, Integer> squareFunction = n -> n * n;

        List<Integer> doubledNumbers = mapper.map(numbers, doubleFunction);
        List<Integer> squaredNumbers = mapper.map(numbers, squareFunction);

        System.out.println("Original list: " + numbers);
        System.out.println("Doubled Numbers: " + doubledNumbers);
        System.out.println("Squared Numbers: " + squaredNumbers);
    }
}
