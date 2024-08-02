package session_18.challenge.challenge_6;

import java.util.Arrays;
import java.util.List;

public class StringLengthComparatorExample {

    public static void main(String[] args) {
        StringLengthComparator comparator = (s1, s2) -> Integer.compare(s1.length(), s2.length());

        List<String> words = Arrays.asList("pineapple", "pear", "banana", "kiwi", "strawberry");

        words.sort(comparator::compare);

        System.out.println("Strings sorted by lenght: " + words);
    }
}
