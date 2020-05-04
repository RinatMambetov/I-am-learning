package lesson18;

public class ShowArray {

    static void showArray(String[][] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print("{");

            for (int j = 0; j < array[i].length; j++) {

                if (j != array[i].length - 1) {
                    System.out.print(array[i][j] + ", ");
                } else {
                    System.out.print(array[i][j]);
                }
            }
            System.out.println("}");
        }
    }
}

class TestShowArray {

    public static void main(String[] args) {
        String[][] array = new String[][]{{"zero-zero", "zero-one", "zero-two"}, {"one-zero", "one-one"}, {"two-zero", "two-one", "two-two"}};
        ShowArray.showArray(array);
    }

}
