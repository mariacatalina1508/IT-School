package session_7_utility_classes.challenge;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Challenge8 {

    public static void main(String[] args) {
        LocalDate myDate = LocalDate.of(2000, 8, 12);
        String findDayOfWeeks;
        System.out.println("The day of the week is: " + findDayOfWeeks(myDate));
    }

    public static String findDayOfWeeks(LocalDate myDate) {
        DayOfWeek dayOfWeek = myDate.getDayOfWeek();
        return dayOfWeek.toString();
    }
}
