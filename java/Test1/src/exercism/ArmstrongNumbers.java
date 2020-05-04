package exercism;

import java.util.ArrayList;

class ArmstrongNumbers {

    ArrayList getDigitsOfNumber(int number) {
        ArrayList<Integer> list = new ArrayList<>();
        do {
            list.add(number % 10);
            number /= 10;
        } while (number > 0);
        return list;
    }

    boolean isArmstrongNumber(int numberToCheck) {
        ArrayList<Integer> list = getDigitsOfNumber(numberToCheck);
        int length = list.size();
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += Math.pow(list.get(i), length);
        }
        if (sum == numberToCheck) return true;
        return false;
    }
}

class TestArmstrongNumbers {
    public static void main(String[] args) {
        ArmstrongNumbers an = new ArmstrongNumbers();
        System.out.println(an.isArmstrongNumber(153));
    }
}