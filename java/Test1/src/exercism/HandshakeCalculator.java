package exercism;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {

        int tempNumber;
        if (number > 16) {
            tempNumber = number - 16;
        } else tempNumber = number;
        List<Signal> result = new ArrayList<>();
        String binNumber = Integer.toBinaryString(tempNumber);
        for (int i = binNumber.length() - 1; i >= 0; i--) {
            if (i == binNumber.length() - 1 && binNumber.charAt(i) == '1') {
                result.add(Signal.WINK);
            }
            if (i == binNumber.length() - 2 && binNumber.charAt(i) == '1') {
                result.add(Signal.DOUBLE_BLINK);
            }
            if (i == binNumber.length() - 3 && binNumber.charAt(i) == '1') {
                result.add(Signal.CLOSE_YOUR_EYES);
            }
            if (i == binNumber.length() - 4 && binNumber.charAt(i) == '1') {
                result.add(Signal.JUMP);
            }
        }
        if (number > 16) {
            Collections.reverse(result);
        }
        return result;
    }
}

class TestHandshakeCalculator {

    public static void main(String[] args) {
        HandshakeCalculator hc = new HandshakeCalculator();
        System.out.println(hc.calculateHandshake(19));
    }
}
