package jaden_casing_strings;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JadenCase {
    public static void main(String[] args) {
        String phrase = "how can mirrors be real if our eyes aren't real";
        System.out.println(toJadenCase(phrase));
    }

    public static String toJadenCase(String phrase) {
        // TODO put your code below this comment
        if (phrase == null || phrase.equals("")) {
            return null;
        }
        return Stream.of(phrase.split(" "))
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase()).collect(Collectors.joining(" "));
    }

}
