package session_18.challenge.challenge_10;

import java.util.List;
import java.util.ArrayList;

public class NameFormatterExample {

    public static void main(String[] args) {
        NameFormatter formatter = names -> {
            List<String> upperCaseNames = new ArrayList<>();
            for (String name : names) {
                upperCaseNames.add(name.toLowerCase());
            }
            return upperCaseNames;
        };

        List<String> firstNames = List.of("Abel", "Barney", "Carson", "Dawson", "Edan");

        List<String> upperCaseNames = formatter.formatNamesToUpperCase(firstNames);

        System.out.println("Original names: " + firstNames);
        System.out.println("Uppercase names: " + upperCaseNames);
    }
}
