package session_19.challenge.challenge_8;

import java.util.Arrays;
import java.util.List;

public class VowelCounter {

    public static void main(String[] args) {
        String sentence = "Hello World";

        long vowelCount = sentence.toLowerCase().chars()
                .filter(c -> "aeiou".indexOf(c) != -1)
                .count();

        System.out.println("Number of vowels: " + vowelCount);
    }
}