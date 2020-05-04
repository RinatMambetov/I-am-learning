package lesson9;

public class Test1 {

    int a = 1;
//    static int a = 2;

    void abc(int a) {
        System.out.println(a); //3
        System.out.println(this.a); //1
    }

    public static void main(String[] args) {

        Test1 t = new Test1();
        t.abc(3);

    }

}

