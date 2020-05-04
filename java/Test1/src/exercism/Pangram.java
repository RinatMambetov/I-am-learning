package exercism;

public class Pangram {

    public boolean isPangram(String input) {

        String inputLowercase = input.toLowerCase();
        String abc = "abcdefghijklmnopqrstuvwxyz";
        int count = 0;
        StringBuilder alreadyContain = new StringBuilder();
        for (int i = 0; i < inputLowercase.length(); i++) {
            char charItem = inputLowercase.charAt(i);
            String stringItem = Character.toString(charItem);
            if (abc.contains(stringItem) && alreadyContain.indexOf(stringItem) < 0) {
                count++;
                alreadyContain.append(stringItem);
            }
        }
        if (count == 26) return true;
        return false;
    }
}
