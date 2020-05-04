package lesson14;

public class TimeHomework {

    static void printTime() {
        OUTER:
        for (int hour = 0; hour <= 6; hour++) {
            INNER:
            for (int minute = 0; minute <= 59; minute++) {

                if (hour > 1 && minute % 10 == 0) break OUTER;

                for (int second = 0; second <= 59; second++) {

                    if (second * hour > minute) {
                        System.out.println("!");
                        continue INNER;
                    }
                    System.out.println(hour + ":" + minute + ":" + second);

                }
            }
        }
    }

}

class testTime {

    public static void main(String[] args) {
        TimeHomework.printTime();
    }

}