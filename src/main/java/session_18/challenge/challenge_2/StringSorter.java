package session_18.challenge.challenge_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringSorter {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Andy", "Carver", "Dean", "Bart", "Ethan"));

        Collections.sort(names, (s1, s2) -> s1.compareTo(s2));

        System.out.println("Sorted names: " + names);
    }
}