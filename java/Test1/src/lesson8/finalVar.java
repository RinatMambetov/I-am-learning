package lesson8;

public class finalVar {

    final int a = 10; // instance variable

// final variables должны быть всегда инициализированы до их использования
// 1. при определении переменной
// 2. в каждом конструкторе (если переменная не static)

    void sum(final int b) {
        final int c; // local variable
        c = a + b;
        System.out.println(c);
    }

}

class test {

    public static void main(String[] args) {

        finalVar test = new finalVar();
        System.out.println(test.a);

        test.sum(20);
    }

}
