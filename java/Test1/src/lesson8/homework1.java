package lesson8;

public class homework1 {

    static int mult(int a, int b, int c) {
        return a * b * c;
    }

    static void divide(int a, int b) {
        System.out.println("Result is: " + a / b + " and remainder is: " + a % b + ".");
    }

}

class testStaticMethod {

    public static void main(String[] args) {

        System.out.println(homework1.mult(2, 3, 4) + homework1.mult(-2, 5, 6));
        homework1.divide(9, 2);
        homework1.divide(11, 3);

    }

}