package exercism;

import java.util.ArrayList;

class Acronym {

    private String acronym = "";

    Acronym(String phrase) {
        phrase = phrase.replaceAll(" - ", " ");
        ArrayList<String> words = new ArrayList<>();
        String word = "";
        for (int index = 0; index < phrase.length(); index++) {
            char symbol = phrase.charAt(index);
            word += symbol;
            if (symbol == ' ' || symbol == '-' || index == phrase.length() - 1) {
                if (word.charAt(0) == '_') word = word.substring(1);
                words.add(word.toUpperCase());
                word = "";
            }
        }
        for (String item : words) {
            this.acronym += item.charAt(0);
        }
    }

    String get() {
        return this.acronym;
    }
}

class TestAcronym {

    public static void main(String[] args) {
        Acronym acr = new Acronym("_PE_ - n-e, G'e");
        System.out.println(acr.get());
    }
}
