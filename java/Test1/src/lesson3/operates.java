package lesson3;

public class operates {
    public static void main(String[] args) {

        int i1 = 5;
        int i2 = 11;
        double d1 = 5.5;
        double d2 = 1.3;
        long l = 20L;
        double result = 0;
        result = i2 / d1 + d2 % i1 - l;

        System.out.println(result);

        int a = 5;
        int a1 = a-- - --a + ++a + a++ + a;
        int b = 8;
        int b1 = ++b - b++ + ++b - --b;

        System.out.println(a1);
        System.out.println(b1);
        System.out.println();

        // short circuit

        int x = 10, y = 20, z = 19;
        boolean e = x > y && ++z == y;

        System.out.println(z);
        System.out.println(e);

        e = x > y & ++z == y;

        System.out.println(z);
        System.out.println(e);

        boolean f = x < y && --z + 1 == y;

        System.out.println(z);
        System.out.println(f);
        System.out.println();

        // bitwise operators

        System.out.println(10 & 6); // 1010 & 0110 = 0010
        System.out.println(10 | 8); // 1010 | 1000 = 1010
        System.out.println();

        // exclusive bitwise or

        boolean b01 = true;
        boolean b02 = false;
        boolean b03 = false;
        boolean b04 = true;

        System.out.println(b01 ^ b02 ^ b03);
        System.out.println(b01 ^ b02 ^ b03 ^ b04);
        System.out.println();

        char ch = 'a';
        System.out.println(ch + 25); // unicode

    }
}
