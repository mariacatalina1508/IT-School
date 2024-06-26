package session_7_utility_classes.challenge;

import java.time.*;

public class Challenge2 {


    public static void main(String[] args) {
        String inputDate = "2024-06-12";

        displayDateComponents(inputDate);
    }

    public static void displayDateComponents(String date) {
        LocalDate localDate = LocalDate.parse(date);

        int year = localDate.getYear();
        int month = localDate.getMonthValue();
        int day = localDate.getDayOfMonth();

        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day : " + day);
    }
}
