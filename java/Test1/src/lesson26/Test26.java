package lesson26;

public class Test26 {
    public static void main(String[] args) {
        Animal an = new Tiger();
        System.out.println(an.a);
        System.out.println(an.b);
        an.abc();
        an.def();
    }
}

class Animal {
    int a = 5;
    static int b = 10;
    void abc() {
        System.out.println("animal");
    }
    static void def() {
        System.out.println("static animal");
    }
}

class Tiger extends Animal {
    int a = 15;
    static int b = 20;
    void abc() {
        System.out.println("tiger");
    }
    static void def() {
        System.out.println("static tiger");
    }
}
