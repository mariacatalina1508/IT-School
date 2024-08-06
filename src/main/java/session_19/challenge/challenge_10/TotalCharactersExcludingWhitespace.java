package session_19.challenge.challenge_10;

import java.util.Arrays;
import java.util.List;

public class TotalCharactersExcludingWhitespace {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Java Streams", "Method References", "Lambda Expressions");

        long totalCharacters = strings.stream()
                .flatMapToInt(String::chars)
                .filter(ch -> !Character.isWhitespace(ch))
                .count();

        System.out.println("Total number of characters (excluding whitespace): " + totalCharacters);
    }
}