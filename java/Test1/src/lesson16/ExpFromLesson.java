package lesson16;

public class ExpFromLesson {

    static void printPoem(String str) {

        String secondString = str.toUpperCase();
        char c1, c2;

        for (int i = 0; i < str.length(); i++) {
            c1 = str.charAt(i);
            c2 = secondString.charAt(i);

            if (c1 != ' ' && c1 == c2) {
                System.out.println();
            }

            System.out.print(c1);
        }

    }

}

class TestExp {

    public static void main(String[] args) {
        ExpFromLesson.printPoem("Qwerty Asdfgh Zxcvbn");
    }

}
