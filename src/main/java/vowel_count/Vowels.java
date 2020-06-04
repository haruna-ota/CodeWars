//2020.05/27(Wed)

package vowel_count;

import java.util.stream.Stream;

public class Vowels {
    public static void main(String[] args) {
        String s = "satomichandayo";
        System.out.println(getCount(s));
    }

    public static int getCount(String str) {
        return (int) Stream.of(str.split(""))
                .filter(s -> s.equals("a") || s.equals("i") || s.equals("u") || s.equals("e") || s.equals("o"))
                .count();
    }
}
