package lesson8;

public class homework2 {

    static final double pi = 3.14;

    double circleArea(double radius) {
        double area = pi * radius * radius;
        return area;
    }

    static double circleLength(double radius) {
        double length = 2 * pi * radius;
        return length;
    }

    void circleInfo(double radius) {
        System.out.println("Radius of circle is: " + radius + ", area is: " + circleArea(radius) + ", length is: " + circleLength(radius) + ".");
    }

}

class testStaticFinalVariable {

    public static void main(String[] args) {

        double r = 2.34;
        homework2 test = new homework2();

        System.out.println("Area of circle is: " + test.circleArea(r));
        System.out.println("Length of circle is: " + homework2.circleLength(r));
        test.circleInfo(r);

    }

}
