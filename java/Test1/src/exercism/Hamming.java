package exercism;

class Hamming {

    String leftStrand, rightStrand;

    Hamming(String leftStrand, String rightStrand) {
        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
        if (leftStrand.isEmpty())
            throw new IllegalArgumentException("left strand must not be empty.");
        if (rightStrand.isEmpty())
            throw new IllegalArgumentException("right strand must not be empty.");
        if (leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
    }

    int getHammingDistance() {
        int count = 0;
        for (int strandIndex = 0; strandIndex < leftStrand.length(); strandIndex++) {
            char leftChar = leftStrand.charAt(strandIndex);
            char rightChar = rightStrand.charAt(strandIndex);
            if (leftChar != rightChar) {
                count++;
                System.out.println(leftChar);
                System.out.println(rightChar);
            }
        }
        return count;
    }
}

class TestHamming {
    public static void main(String[] args) {
        Hamming hm = new Hamming("", "asd");
        hm.getHammingDistance();
    }
}