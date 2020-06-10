package disemvowel_trolls;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Troll {
    public static void main(String[] args) {
        String str = "This website is for losers LOL!";
        System.out.println(disemvowel(str));
    }

    public static String disemvowel(String str) {
        // Code away...
//        String disvowel = Stream.of(str.split("")).filter(s -> isNotVowel(s)).collect(Collectors.joining(""));
//        System.out.println(disvowel);
        return Stream.of(str.split("")).filter(s -> isNotVowel(s)).collect(Collectors.joining(""));
    }

    private static boolean isNotVowel(String str) {
        String s = str.toLowerCase();
        return !s.equals("a") && !s.equals("i") && !s.equals("u") && !s.equals("e") && !s.equals("o");
    }
}
