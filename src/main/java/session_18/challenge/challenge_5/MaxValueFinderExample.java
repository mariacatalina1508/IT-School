package session_18.challenge.challenge_5;

import java.util.List;
import java.util.Optional;

public class MaxValueFinderExample {
    public static void main(String[] args) {
        MaxValueFinder maxValueFinder = numbers -> {
            if (numbers == null || numbers.isEmpty()) {
                return Optional.empty();
            }
            return Optional.of(numbers.stream().max(Integer::compare).get());
        };

        List<Integer> numbers1 = List.of(5, 12, 3, 9, 21, 7);
        List<Integer> numbers2 = List.of();
        List<Integer> numbers3 = List.of(-1, -3, -2, -7, -5);

        maxValueFinder.findMax(numbers1).ifPresentOrElse(
                max -> System.out.println("Max value in numbers1: " + max),
                () -> System.out.println("numbers1 is empty")
        );

        maxValueFinder.findMax(numbers2).ifPresentOrElse(
                max -> System.out.println("Max value in numbers2: " + max),
                () -> System.out.println("numbers2 is empty")
        );

        maxValueFinder.findMax(numbers3).ifPresentOrElse(
                max -> System.out.println("Max value in numbers3: " + max),
                () -> System.out.println("numbers3 is empty")
        );
    }
}