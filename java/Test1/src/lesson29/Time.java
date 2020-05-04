package lesson29;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Time {

    DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("YYYY, MMMM-dd !! hh:mm");
    DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("hh:mm, dd/MMM/YY");

    void changeTime(LocalDateTime ldt1, LocalDateTime ldt2, Period p, Duration d) {

        while (ldt1.isBefore(ldt2)) {

            System.out.print("Working since: " + ldt1.format(dtf1));
            ldt1 = ldt1.plus(p);
            System.out.println(" to: " + ldt1.format(dtf1));
            System.out.print("Resting since: " + ldt1.format(dtf2));
            ldt1 = ldt1.plus(d);
            System.out.println(" to: " + ldt1.format(dtf2));
        }
    }
}

class TestTime {

    public static void main(String[] args) {

        Time t = new Time();
        LocalDateTime ldt1 = LocalDateTime.now();
        LocalDateTime ldt2 = LocalDateTime.of(2020, 2, 5, 12, 00);
        Period p = Period.ofDays(1);
        Duration d = Duration.ofHours(2);
        t.changeTime(ldt1, ldt2, p, d);
    }
}
