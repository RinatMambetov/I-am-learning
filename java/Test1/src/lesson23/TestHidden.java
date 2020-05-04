package lesson23;

class A {
    static void print() {
        System.out.println("A");
    }
}

class B extends A {
    static void print() {
        System.out.println("B");
    }
}

public class TestHidden {

    public static void main(String[] args) {
        A test1 = new B();
        B test2 = new B();
        test1.print();
        test2.print();
    }
}
