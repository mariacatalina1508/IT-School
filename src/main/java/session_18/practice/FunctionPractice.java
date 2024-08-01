package session_18.practice;

import java.util.function.Function;

public class FunctionPractice {

    public static void main(String[] args) {
        Function<String, Integer> strLenghtFinder = str -> str.length();
        System.out.println(strLenghtFinder.apply("Hello"));
    }
}
