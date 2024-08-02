package session_18.challenge.challenge_5;

import java.util.List;
import java.util.Optional;

@FunctionalInterface
interface MaxValueFinder {
    Optional<Integer> findMax(List<Integer> numbers);
}