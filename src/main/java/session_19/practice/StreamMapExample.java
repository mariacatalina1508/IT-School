package session_19.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jack", "Alice");

        //convert all names to uppercase and collect them in a new list
        List<String> upperCaseNames = names.stream()
                .map(name -> name.toUpperCase())
                .toList();

        System.out.println(upperCaseNames);
    }
}