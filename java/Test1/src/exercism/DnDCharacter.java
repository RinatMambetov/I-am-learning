package exercism;


import java.util.ArrayList;
import java.util.Random;

public class DnDCharacter {

    static int ability() {

//        int s;
//        if (s == null) System.out.println("null");

        Random rnd = new Random();
        int amountThrows = 4;
        ArrayList<Integer> randomDices = new ArrayList<>(amountThrows);
        for (int i = 0; i < amountThrows; i++) {
            int randomDice = rnd.nextInt(6) + 1;
            randomDices.add(randomDice);
        }
        System.out.println(randomDices);
        randomDices.sort((x, y) -> x.compareTo(y));
        System.out.println(randomDices);
        randomDices.remove(0);
        System.out.println(randomDices);

        int sum = 0;
        for (int item : randomDices) {
            sum += item;
        }
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {
        DnDCharacter.ability();
    }
}
