package session_7_utility_classes.challenge;

import java.time.LocalDate;

public class Challenge3 {

    public static LocalDate createSpecificDate() {
        LocalDate specificDate = LocalDate.of(2025, 8, 19);
        return specificDate;
    }

    public static void main(String[] args) {
        LocalDate date = createSpecificDate();
        System.out.println("The specific date is: " + date);
    }
}
