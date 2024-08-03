package session_18.challenge.challenge_8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

@FunctionalInterface
public interface ListMapper {

    List<Integer> map(List<Integer> list, Function<Integer, Integer> function);
}
