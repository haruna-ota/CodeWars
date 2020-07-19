package isograms;

import java.util.stream.Stream;

public class Isogram {
    public static void main(String[] args) {
        String str = "aba";
        System.out.println(isIsogram(str));
    }

    public static boolean isIsogram(String str) {
        // ...
        return str.equals("") || str.length() == Stream.of(str.toLowerCase().split("")).distinct().count();
    }
}
