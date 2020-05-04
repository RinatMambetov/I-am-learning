package lesson6;

public class homework1 {

    int sum() {
        int result = 0;
        System.out.println(result);
        return result;
    }

    int sum(int i1) {
        int result = i1;
        System.out.println(result);
        return result;
    }

    int sum(int i1, int i2) {
        int result = i1 + i2;
        System.out.println(result);
        return result;
    }

    int sum(int i1, int i2, int i3) {
        int result = i1 + i2 + i3;
        System.out.println(result);
        return result;
    }

    int sum(int i1, int i2, int i3, int i4) {
        int result = i1 + i2 + i3 + i4;
        System.out.println(result);
        return result;
    }

}

class sum {

    public static void main(String[] args) {

        homework1 sum = new homework1();
        sum.sum();
        sum.sum(2);
        sum.sum(2, 4);
        sum.sum(2, 4, 8);
        sum.sum(2, 4, 8, 6);

    }
}