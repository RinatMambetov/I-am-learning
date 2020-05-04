package lesson9;

public class EightObjects {
}

class OnlyTwo {

    public static void main(String[] args) {

        EightObjects o1 = new EightObjects();
        EightObjects o2 = new EightObjects();
        EightObjects o3 = new EightObjects();
        EightObjects o4 = new EightObjects();
        EightObjects o5 = new EightObjects();
        EightObjects o6 = new EightObjects();
        EightObjects o7 = new EightObjects();
        EightObjects o8 = new EightObjects();

        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        System.out.println(o4);
        System.out.println(o5);
        System.out.println(o6);
        System.out.println(o7);
        System.out.println(o8);
        System.out.println();

        o3 = o4 = o5 = o6 = o7 = o8 = null;

        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        System.out.println(o4);
        System.out.println(o5);
        System.out.println(o6);
        System.out.println(o7);
        System.out.println(o8);

    }

}
