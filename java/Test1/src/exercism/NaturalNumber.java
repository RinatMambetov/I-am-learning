package exercism;

class NaturalNumber {

    Classification getClassification(int number) {

        if (number <= 0) throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        int aliquotSum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) aliquotSum += i;
        }
        if (aliquotSum == number) return Classification.PERFECT;
        if (aliquotSum > number) return Classification.ABUNDANT;
        return Classification.DEFICIENT;
    }
}

class TestNaturalNumber {
    public static void main(String[] args) {
        NaturalNumber nn = new NaturalNumber();
        System.out.println(nn.getClassification(-1));
    }
}