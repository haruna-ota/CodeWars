package shortest_word;

import java.util.Comparator;
import java.util.stream.Stream;

public class ShortestWord {
    public static void main(String[] args) {
        String s = "Hello World Thank you";
        System.out.println(findShort(s));
    }

    public static int findShort(String s) {
        return Stream.of(s.split(" ")).map(String::length).min(Comparator.naturalOrder()).get();
    }
}
