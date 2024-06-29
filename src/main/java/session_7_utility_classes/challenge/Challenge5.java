package session_7_utility_classes.challenge;

import java.time.LocalDate;

public class Challenge5 {

    public static void main(String[] args) {
        boolean result = isTodaySpecificDate();
        System.out.println(result);
    }

    private static boolean isTodaySpecificDate() {
        LocalDate today = LocalDate.now();
        LocalDate specificDate = LocalDate.of(2018, 1, 1);
        return today.equals(specificDate);
    }
}
