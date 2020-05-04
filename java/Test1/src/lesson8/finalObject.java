package lesson8;

public class finalObject {

    String color = "blue";
    String engine = "V6";

}

class newTest {

    String name = "Ivan";
    final finalObject human = new finalObject();

    public static void main(String[] args) {

        newTest t1 = new newTest();
//        t1.human = new nonAccessModifiers2(); //mistake
        t1.human.color = "red";
        t1.human.engine = "V8";
        t1.name = "Alex";

    }

}