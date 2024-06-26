package session_7_utility_classes.challenge;

import java.time.LocalDate;

public class Challenge1 {

    public static void main(String[] args) {
        displayTodayDate();

    }
    public static void displayTodayDate() {
        LocalDate displayTodayDate = LocalDate.now();
        System.out.println("Today's date is: " + displayTodayDate);
    }
}
