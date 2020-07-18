package persistent_bugger;

import java.util.stream.Stream;

/***
 Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence, which is the number of times you must multiply the digits in num until you reach a single digit.

 For example:

 persistence(39) == 3 // because 3*9 = 27, 2*7 = 14, 1*4=4
 // and 4 has only one digit

 persistence(999) == 4 // because 9*9*9 = 729, 7*2*9 = 126,
 // 1*2*6 = 12, and finally 1*2 = 2

 persistence(4) == 0 // because 4 is already a one-digit number
 ***/

public class Persist {
    public static void main(String[] args) {
        long n = 356;
        System.out.println(persistence(n));
    }

    //    public static int persistence(long n) {
//        return String.valueOf(n).length() == 1 ? 0 : persistence(n, 0);
//    }
//
//    public static int persistence(long n, int acc) {
//        // your code
//        int multiple = Stream.of(String.valueOf(n).split(""))
//                .mapToInt(Integer::parseInt)
//                .reduce(1, (a, num) -> a * num);
//        acc++;
//        return String.valueOf(multiple).length() > 1 ? persistence(multiple, acc) : acc;
//    }
    public static int persistence(long n) {
        return persistence(n, 0);
    }

    public static int persistence(long n, int acc) {
//        if (String.valueOf(n).length() == 1) {
//            return acc;
//        }
//        int multiple = Stream.of(String.valueOf(n).split(""))
//                .mapToInt(Integer::parseInt)
//                .reduce(1, (a, num) -> a * num);
//        return persistence(multiple, acc + 1);
        return String.valueOf(n).length() == 1 ? acc :
                persistence(Stream.of(String.valueOf(n).split(""))
                                    .mapToInt(Integer::parseInt)
                                    .reduce(1, (a, num) -> a * num), acc + 1);
    }
}
