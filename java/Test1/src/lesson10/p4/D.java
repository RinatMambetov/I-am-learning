package lesson10.p4;

import lesson10.p1.A;
import static lesson10.p1.p2.B.b;
import lesson10.p1.p2.p3.C;
import lesson10.p4.p5.E;

public class D {

    String d = "d";

    public static void main(String[] args) {

        A objA = new A();
        C objC = new C();
        D objD = new D();
        E objE = new E();

        String result = objA.a + b + objC.c + objD.d + objE.e;
        System.out.println(result);

    }

}
