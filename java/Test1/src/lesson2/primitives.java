package lesson2;

public class primitives {
    public static void main (String[] args) {

        byte b1 = 10;
        short s1 = 200;
        int i1 = 2000123222;
        long l1 = 10_000_000_000L;

        float f1 = 1.2f;
        float f2 = 2.13f;
        double d1 = 3.14d;
        double d2 = -0.45;

        char c1 = 'a';
        char c2 = 324;
        char c3 = '\u0439';

        boolean bool = true;

        int i2 = 0b111001;
        int i3 = 0_127;
        int i4 = 0xAB12F;
        int i5 = 1_000__000___000;

        byte b01 = 12;
        byte b02 = 0b1100;
        byte b03 = 0_14;
        byte b04 = 0xC;

        short s01 = -1300;
        short s02 = -0b10100010100;
        short s03 = -0_2424;
        short s04 = -0x514;

        int i01 = 0;
        int i02 = 0b0;
        int i03 = 0_0;
        int i04 = 0x0;

        long l01 = 123456789L;
        long l02 = 0b111010110111100110100010101L;
        long l03 = 0_726746425L;
        long l04 = 0x75BCD15L;

        System.out.println(b01);
        System.out.println(b02);
        System.out.println(b03);
        System.out.println(b04);

        System.out.println(s01);
        System.out.println(s02);
        System.out.println(s03);
        System.out.println(s04);

        System.out.println(i01);
        System.out.println(i02);
        System.out.println(i03);
        System.out.println(i04);

        System.out.println(l01);
        System.out.println(l02);
        System.out.println(l03);
        System.out.println(l04);

        System.out.println(f1);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
