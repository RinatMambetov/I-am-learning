package lesson9;

public class EightObjects2 {

    static void createString() {
        String s1 = new String("a");
        String s2 = new String("b");
        String s3 = new String("c");
        String s4 = new String("d");
        String s5 = new String("e");
        String s6 = new String("f");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
    }

    public static void main(String[] args) {

        EightObjects2 o1 = new EightObjects2();
        EightObjects2 o2 = new EightObjects2();

        EightObjects2.createString();

        System.out.println(o1);
        System.out.println(o2);

//        System.out.println(s1);

    }

}