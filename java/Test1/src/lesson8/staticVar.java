package lesson8;

public class staticVar {

    String name;
    int course;
    static int count;
    static final int a = 2;

    // static элементы принадлежат всему классу, а не отдельным его объектам. существуют и могут быть использованы без создания объекта класса.

    staticVar(String name, int course) {
        this.name = name;
        this.course = course;
        count++;
    }

    static void showCount() {
        System.out.println("Count is: "  + count);
    }

    // static переменные и методы не могут вызывать, обращаться к instance переменным и методам.

    static void testMethod() {
        count++;
        staticVar stTest = new staticVar("Boris", 1);
        stTest.course++; // only after creating object stTest
    }

}

class student {

    public static void main(String[] args) {

        // к static элементам принять обращаться используя имя класса, а не ссылку на созднный объект

        staticVar st1 = new staticVar("Ivan", 2);
        System.out.println(staticVar.count);
        staticVar st2 = new staticVar("John", 1);
        System.out.println(staticVar.count);
        staticVar st3 = new staticVar("Greta", 3);
        System.out.println(staticVar.count);

        staticVar.showCount();
        System.out.println(staticVar.a);
    }

}