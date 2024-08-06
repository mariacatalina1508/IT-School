package session_19.challenge.challenge_2;

import java.util.Arrays;
import java.util.List;

public class LongestStringFinder {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        String logestString = strings.stream()
                .max((s1, s2) -> Integer.compare(s1.length(), s2.length()))
                .orElse(null);

        System.out.println("The longest string is: " + logestString);
    }
}
