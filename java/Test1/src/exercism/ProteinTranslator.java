package exercism;

import java.util.ArrayList;
import java.util.List;

class ProteinTranslator {

    List<String> translate(String rnaSequence) {

        List result = new ArrayList();

        for (int i = 0; i < rnaSequence.length() / 3; i++) {
            String codon = rnaSequence.substring(i * 3, i * 3 + 3);
            if (codon.equals("AUG")) result.add("Methionine");
            if (codon.equals("UUU") || codon.equals("UUC")) result.add("Phenylalanine");
            if (codon.equals("UUA") || codon.equals("UUG")) result.add("Leucine");
            if (codon.equals("UCU") || codon.equals("UCC") || codon.equals("UCA") || codon.equals("UCG")) result.add("Serine");
            if (codon.equals("UAU") || codon.equals("UAC")) result.add("Tyrosine");
            if (codon.equals("UGU") || codon.equals("UGC")) result.add("Cysteine");
            if (codon.equals("UGG")) result.add("Tryptophan");
            if (codon.equals("UAA") || codon.equals("UAG") || codon.equals("UGA")) break;
        }
        return result;
    }
}

class TestProteinTranslator {
    public static void main(String[] args) {
        ProteinTranslator pt = new ProteinTranslator();
        System.out.println(pt.translate("UGGUGUUAUUAAUGGUUU"));
//        System.out.println(pt.translate("AUG"));
    }
}