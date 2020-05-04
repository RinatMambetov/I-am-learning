package exercism;

public class RnaTranscription {

    String transcribe(String dnaStrand) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < dnaStrand.length(); i++) {

            switch (dnaStrand.charAt(i)) {
                case 'D': sb.append("C");
                break;
                case 'C': sb.append("G");
                break;
                case 'T': sb.append("A");
                break;
                case 'A': sb.append("U");
                break;
            }
        }
        String result = sb.substring(0);

        return result;
    }
}

class TestRnaTranscription {

    public static void main(String[] args) {

        RnaTranscription rna = new RnaTranscription();
        System.out.println(rna.transcribe("D"));
    }
}
