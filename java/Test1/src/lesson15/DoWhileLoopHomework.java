package lesson15;

public class DoWhileLoopHomework {

    static void printTime() {
        int hour = 0;
        OUTER:
        while (hour <= 6) {
            int minute = -1;

            MIDDLE:
            do {
                minute++;
                if (hour > 1 && minute % 10 == 0) break OUTER;
                int second = 0;

                INNER:
                while (second <= 59) {

                    if (second * hour > minute) {
                        System.out.println("!");
                        continue MIDDLE;
                    }

                    System.out.println(hour + ":" + minute + ":" + second);
                    second++;

                }

            } while (minute <= 58);
            hour++;
        }
    }

}

class TestDoWhileLoops {

    public static void main(String[] args) {
        DoWhileLoopHomework.printTime();
    }

}
