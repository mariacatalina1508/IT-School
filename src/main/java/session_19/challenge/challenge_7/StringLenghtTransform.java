package session_19.challenge.challenge_7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringLenghtTransform {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Hello", "World", "Java", "Streams");
        List<Integer> lengths = strings.stream()
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println(lengths);
    }
}