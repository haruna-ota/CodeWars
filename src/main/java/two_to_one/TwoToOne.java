package two_to_one;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TwoToOne {
    public static void main(String[] args) {
        String s1 = "xyaabbbccccdefww";
        String s2 = "xxxxyyyyabklmopq";
        System.out.println(longest(s1, s2));
    }

    public static String longest(String s1, String s2) {
        // your code
        return Stream.of((s1 + s2).split("")).distinct().sorted().collect(Collectors.joining());
    }
}
