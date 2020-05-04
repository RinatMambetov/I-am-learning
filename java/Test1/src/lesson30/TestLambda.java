package lesson30;

public class TestLambda {

    static void useInterface(LambdaInterface li) {

        System.out.println(li.getLength("hello"));
    }

    public static void main(String[] args) {

        useInterface(ui -> ui.length());
    }
}

interface LambdaInterface {

    int getLength(String str);
}