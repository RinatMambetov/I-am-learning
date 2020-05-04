package exercism;

import java.math.BigInteger;

public class Grains {

    static BigInteger grainsOnSquare(final int square) {
        String exceptionMessage = "square must be between 1 and 64";
        BigInteger result = BigInteger.ZERO;
        if (square >= 1 && square <= 64) {
            result = BigInteger.TWO.pow(square - 1);
        } else throw new IllegalArgumentException(exceptionMessage);
        return result;
    }

    static BigInteger grainsOnBoard() {
        BigInteger result = BigInteger.ZERO;
        for (int i = 1; i <= 64; i++) {
            result = result.add(grainsOnSquare(i));
            System.out.println(result);
        }
        return result;
    }
}

class TestGrains {

    public static void main(String[] args) {

        System.out.println(Grains.grainsOnBoard());
    }
}
