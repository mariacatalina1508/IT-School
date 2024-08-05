package session_19.practice;

import java.util.List;
import java.util.Arrays;

public class StreamReduceExample {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 6, 7);

        //sum all the numbers from the list
        int sum = numbers.stream()
                .reduce(0, Integer::sum);

        System.out.println("Sum of numbers: " + sum);
    }
}