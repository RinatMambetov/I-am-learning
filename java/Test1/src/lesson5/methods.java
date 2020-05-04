package lesson5;

public class methods {

    // methods(){} - default constructor

    // user defined constructor
    methods(int sumParam, double averParam) {
        sum = sumParam;
        aver = averParam;
    }

    int sum;
    double aver;

    // any method has return type (void, int, ...)

    double getSum(int a, int b, int c) {
        sum = a + b + c;
        return sum;
    }

    double getAverage(int a, int b, int c) {
        aver = getSum(a, b, c) / 3;
        return aver;
    }

    void printSum() {
        System.out.println("Your sum is: " + sum);
    }

    void printAverage() {
        System.out.println("Your average is: " + aver);
    }

    printMessage printMess;

    void printM() {
        System.out.println(printMess.test + " " + printMess.accomplished + "!!!");
    }

}

class printMessage {

    String test, accomplished;

    printMessage(String firstWord, String secondWord) {
        test = firstWord;
        accomplished = secondWord;
    }
}

class test {

    public static void main(String[] args) {

        // name of constructor == name of class

        methods testMethod = new methods(50, 65.5);
        testMethod.printSum();
        testMethod.printAverage();

        int a = 10, b = 20, c = 35;

        testMethod.getSum(a, b, c);
        testMethod.getAverage(a, b, c);
        testMethod.printSum();
        testMethod.printAverage();

        testMethod.printMess = new printMessage("Test", "accomplished");
        testMethod.printM();
    }

}