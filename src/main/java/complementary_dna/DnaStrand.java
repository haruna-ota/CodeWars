package complementary_dna;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DnaStrand {
    public static void main(String[] args) {
        String dna = "ATTGC";
        System.out.println(makeComplement(dna));
    }

    public static String makeComplement(String dna) {
        //Your code
        return Stream.of(dna.split("")).map(s -> changeSideOfTheDNA(s)).collect(Collectors.joining());
    }

    private static String changeSideOfTheDNA(String s) {
        switch (s) {
            case "A":
                return "T";
            case "T":
                return "A";
            case "C":
                return "G";
            case "G":
                return "C";
            default:
                return s;
        }
    }
}
