package TimeAndDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDatePractice {
    public static void main(String args[]) {
        // getCurrentDate
        System.out.println(LocalDate.now());
        // use DateTimeFormatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy");
        System.out.println(formatter.format(LocalDate.now()));
        // get current Datetime
        System.out.println(LocalDateTime.now());
        // get current time
        System.out.println(LocalTime.now());
    }
}
