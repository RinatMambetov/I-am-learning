package lesson23.p1;

class X {

    int getLength(int number) {
        int length = 0;
        int temp = 1;

        while (temp <= number) {
            length++;
            temp *= 10;
        }

        return length;
    }

    public static void main(String[] args) {

        X x = new X();

        int a = 1234;


        System.out.println(x.getLength(a));
    }
}