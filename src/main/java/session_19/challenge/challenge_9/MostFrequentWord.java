package session_19.challenge.challenge_9;

import java.util.*;
import java.util.stream.Collectors;

public class MostFrequentWord {
    public static void main(String[] args) {
        List<String> sentences = Arrays.asList("Hello World", "Hello Everyone", "Welcome to the World of Java");

        List<String> words = sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                .collect(Collectors.toList());

        Map<String, Long> wordCount = words.stream()
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

        Optional<Map.Entry<String, Long>> mostFrequentWord = wordCount.entrySet().stream()
                .max(Map.Entry.comparingByValue());

        mostFrequentWord.ifPresent(entry ->
                System.out.println("Most frequent word: " + entry.getKey() + " with count: " + entry.getValue())
        );
    }
}