package TimeAndDate;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import static org.junit.Assert.*;

public class LocalDatePracticeTest {

    @Test
    public void getCurrentLocalDate() {
        // getCurrentDate
        LocalDate now = LocalDate.now();
        // use DateTimeFormatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy");
        Assert.assertEquals("2017", formatter.format(now));
        // get current Datetime
        System.out.println(LocalDateTime.now());
        // get current time
        System.out.println(LocalTime.now());
    }
}