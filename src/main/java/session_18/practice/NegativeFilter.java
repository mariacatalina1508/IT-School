package session_18.practice;

import java.util.List;

@FunctionalInterface

public interface NegativeFilter {

    List<Integer> filter(List<Integer> numbers);
}
