package session_18.challenge.challenge_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WordSorter {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("Andy", "Carver", "Dean", "Bart", "Ethan"));

        Collections.sort(words, (s1, s2) -> s1.compareTo(s2));
        System.out.println("Alphabetical order: " + words);

        Collections.sort(words, (s1, s2) -> s2.compareTo(s1));
        System.out.println("Reverse alphabetical order: " + words);
    }
}
