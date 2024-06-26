package session_7_utility_classes.practice;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateTimePractice {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);


        long decrement;
        //printLocalDateTimeDecrement(localDateTime, decrement:5L);
        Object localdateTime;
        LocalDateTime localDateTime2 = localdateTime.plusDays(2);
        printLocaldateTimeDifference(localDateTime.minusHours(decrement));
    }

    public static void printLocalDateTimeDecrement(LocalDateTime localDateTime, long decrement) {
        Duration localdateTime;
        System.out.println(localdateTime.minusHours(decrement));
    }
    public static void printLocaldateTimeDifference(LocalDate startLocalDateTime, LocalDateTime endLocalDateTime) {
        Duration duration = Duration.between(startLocalDateTime, endLocalDateTime);
        long hours = duration.toHours();
        long minutes = duration.toMinutes();
        long seconds = duration.getSeconds();

        System.out.printf("Time difference is %d hours, %d minutes, %d seconds, hours, minutes, seconds ";

    }
}
