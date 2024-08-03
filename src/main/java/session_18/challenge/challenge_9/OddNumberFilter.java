package session_18.challenge.challenge_9;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
public interface OddNumberFilter {
    List<Integer> filterOddNumbers(List<Integer> numbers);
}