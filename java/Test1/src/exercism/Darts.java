package exercism;

//import java.lang.Math;

class Darts {

    double x, y;
//    double q = x * x;
//    double z = Math.sqrt(q);

    Darts(double x, double y) {
        this.x = x;
        this.y = y;
    }

    int score() {
        double z = Math.sqrt(x * x + y * y);

        if (z < 1) return 10;
        else if (z < 5) return 5;
        else if (z < 10) return 1;
        else return 0;
    }
}

class TestDarts {
    public static void main(String[] args) {

        Darts d = new Darts(1, 1);
        System.out.println(d.x);
        System.out.println(d.y);
//        System.out.println(d.q);
//        System.out.println(d.z);
        System.out.println(d.score());
    }
}

