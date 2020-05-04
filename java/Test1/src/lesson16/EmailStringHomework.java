package lesson16;

public class EmailStringHomework {

    static void printEmail(String str) {

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '@') {
                count++;
            }
        }

        int start = str.indexOf('@') + 1;
        int end = str.indexOf('.');

        while (count != 0) {

            String substr = str.substring(start, end);
            System.out.println(substr);

            start = str.indexOf('@', end) + 1;
            end = str.indexOf('.', end + 1);

            count--;
        }
    }

}

class TestEmail {

    public static void main(String[] args) {
        EmailStringHomework.printEmail("ya@yahoo.com; on@mail.ru; ona@gmail.com; we@yandex.ru");
    }

}
