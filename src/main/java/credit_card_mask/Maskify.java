package credit_card_mask;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Maskify {
    public static void main(String[] args) {
        String str = "64607935616";
//        String str = "6461";
        System.out.println(maskify(str));
    }

    public static String maskify(String str) {
        if (isMaskable(str)) {
            int rangeToMask = Math.abs(4 - str.length());
            String mask = Stream.of(str.substring(0, rangeToMask).split("")).map(s -> "#").collect(Collectors.joining());
            String notMask = str.substring(rangeToMask);
            return mask + notMask;
        } else {
            return str;
        }
    }

    private static boolean isMaskable(String str) {
        return 4 - str.length() < 0;
    }
}
