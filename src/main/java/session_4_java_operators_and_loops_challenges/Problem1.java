package session_4_java_operators_and_loops_challenges;

public class Problem1 {

    public static void main(String[] args) {
         /* 1. Write a Java program where you create two String objects named stringOne and stringTwo
        with the same value "OpenAI". Check and print whether they refer to the same object. */
        String stringOne = "OpenAI";
        String stringTwo = "OpenAI";

        if (stringOne == stringTwo) {
            System.out.println("StringOne and StringTwo refer to the same object");
        } else {
            System.out.println("stringOne and stringTwo refer to different objects");
        }
    }
}
