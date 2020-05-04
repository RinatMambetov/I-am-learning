package lesson18;

public class SortArray {

    static int[] sortArray(int[] array) {

        for (int i = 0; i < array.length; i++) {

            int min = array[i];
            int index = i;

            for (int j = i + 1; j < array.length; j++) {

                if (array[j] < min) {
                    min = array[j];
                    index = j;
                }
            }
            array[index] = array[i];
            array[i] = min;
        }
        return array;
    }

    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

}

class TestSortArray {

    public static void main(String[] args) {
        int[] array = {-3, 2, 0, -6, 4, -1, 5, 8};
        SortArray.printArray(SortArray.sortArray(array));
    }

}