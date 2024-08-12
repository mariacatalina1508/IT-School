package session_20.challenge.challenge_2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicateStringFinder {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "apple", "cherry", "banana", "apple", "date");

        HashMap<String, Integer> stringCounts = new HashMap<>();

        for (String str : strings) {
            stringCounts.put(str, stringCounts.getOrDefault(str, 0) + 1);
        }
        System.out.println("Strings count: " + stringCounts);

        System.out.println("Strings with duplicates:");
        for (Map.Entry<String, Integer> entry : stringCounts.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times");
            }
        }
    }
}
