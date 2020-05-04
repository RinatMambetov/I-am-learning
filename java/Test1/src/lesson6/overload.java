package lesson6;

public class overload {

    int i;
    String s;

    overload(int i) { // doesn't use
        i = i;
    }

    overload(String s1, int i1) {
        i = i1 * 2;
        s = s1 + " construct";
    }

    int show(int i, String s) {
        System.out.println(s + " " + i);
        int i2 = i*i;
        return i2;
    }

    String show(String s, int i) {
        System.out.println(s + " " + i);
        String s2 = s + " test";
        return s2;
    }

}

class overloadTest {

    public static void main(String[] args) {

        overload test = new overload("test", 11);

        System.out.println(test.i);
        System.out.println(test.s);

        int test1 = test.show(100, "first");
        String test2 = test.show("second", 2);

        System.out.println(test1);
        System.out.println(test2);

    }

}