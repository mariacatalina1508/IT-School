package session_18.challenge.challenge_7;

public class StringTrimmerExample {
    public static void main(String[] args) {
        StringTrimmer trimmer = (s, n) -> {
            if (n >= s.length()) {
                return s;  //
            }
            return s.substring(0, n);
        };

        // Test cases
        String text1 = "Hello, world!";
        String text2 = "OpenAI";
        String text3 = "Lambda";

        System.out.println(trimmer.trim(text1, 5));
        System.out.println(trimmer.trim(text2, 10));
        System.out.println(trimmer.trim(text3, 3));
        System.out.println(trimmer.trim(text3, 6));
    }
}