package session_18.practice;

import java.util.List;
import java.util.stream.Collectors;

public class NegativeFilterPractice {

    public static void main(String[] args) {
        NegativeFilter negativeFilter = numbers -> numbers.stream()
                .filter(num -> num < 0)
                .toList();

        List<Integer> numbers = List.of(-1, 3, -5, 7);
        System.out.println(negativeFilter.filter(numbers));
    }
}