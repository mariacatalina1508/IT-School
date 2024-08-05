package session_19.practice;

import java.util.Arrays;
import java.util.List;

public class StreamSortExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Billy", "Alice");

        //sort names in natural order and print them
        names.stream()
                .sorted()
                .forEach(name -> System.out.println(name));
    }
}