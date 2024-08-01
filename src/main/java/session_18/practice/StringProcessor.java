package session_18.practice;

@FunctionalInterface
public interface StringProcessor {

    String processor(String input);

    default StringProcessor andThen(StringProcessor afetr) {
        return input -> afetr.processor(this.processor(input));
    }
}