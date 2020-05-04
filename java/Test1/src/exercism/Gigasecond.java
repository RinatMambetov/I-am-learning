package exercism;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class Gigasecond {

    LocalDateTime dateTime;

    Gigasecond(LocalDate moment) {
        this.dateTime = moment.atStartOfDay();
    }

    Gigasecond(LocalDateTime moment) {
        this.dateTime = moment;
    }

    LocalDateTime getDateTime() {

        long gigaSecond = (long) Math.pow(10.0, 9.0);
        LocalDateTime result = dateTime.plus(Duration.ofSeconds(gigaSecond));
        return result;
    }
}

class TestGigasecond {

    public static void main(String[] args) {

        Gigasecond gigaSecond1 = new Gigasecond(LocalDateTime.of(2015, Month.JANUARY, 24, 22, 0, 0));
        System.out.println(gigaSecond1.getDateTime());
        Gigasecond gigaSecond2 = new Gigasecond(LocalDate.of(2011, Month.APRIL, 25));
        System.out.println(gigaSecond2.getDateTime());
    }
}
