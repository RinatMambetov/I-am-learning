package lesson19;

public class Homework {

    static String[] abc(String[]... array) {

        int length = 0, item = 0;

        for (String[] a : array) {
            length += a.length;
        }

        String[] result = new String[length];
            for (String[] a : array) {
                for (String s : a) {
                    item++;
                    result[item - 1] = s;
                }
            }
        return result;
    }

    static void printArray(String[] array) {
        for (String item : array) {
            if (item == null) item = "null";
            System.out.print(item + " ");
        }
    }
}

class TestHomework {

    public static void main(String[] args) {

        String [][] testArray = {{"zero-zero", "zero-one"}, {"one-zero", "one-one", "one-two"}, {"two-zero", "two-one"}};
        String[] spliceArray = Homework.abc(testArray);
        int item = 0;
        for (String argsString : args) {
            for (String testString : spliceArray) {
                item++;
                if (testString.equals(argsString)) {
                    spliceArray[item - 1] = null;
                }
            }
        }
        Homework.printArray(spliceArray);
    }

}