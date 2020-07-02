package recursion;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        System.out.println(
                f1(5)                               // 15
        );
        System.out.println(
                f2(5)                               // 15
        );

//        System.out.println(
//                sum1(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)))                  // 15
//        );
//        System.out.println(
//                sum2(Arrays.asList(1, 2, 3, 4, 5))                  // 15
//        );
        System.out.println(
                Stream.of(1, 2, 3, 4, 5).reduce(0, (acc, n) -> acc + n)     // 15
        );
        //TODO:reverse
//        System.out.println(
//                reverse1("abcde")                                           // edcba
//        );
//        System.out.println(
//                reverse2("abcde")                                           // edcba
//        );
        //TODO:reduce
//        System.out.println(
//                Arrays.stream("abcde".split("")).reduce( ?, ( ?, ?) -> ?)     // edcba
//        );
    }

    /*
     * sum n to 1
     */
    private static int f1(int n) {
        return (n == 0) ? 0             // 基底部, 自明値
                : n + f1(n - 1);        // 再帰部
    }

    /*
     * sum n to 1
     */
    private static int f2(int n) {
        return f2(n, 0);                // 自明値
    }

    private static int f2(int n, int acc) {
        return (n == 0) ? acc           // 基底部
                : f2(n - 1, acc + n);   // 再帰部
    }

    /*
     * sum numbers
     */
//    private static int sum1(List<Integer> ns) {
//        System.out.println(ns);
//        return (ns.size() == 1)
//                ? ns.get(0)
//                : ns.get(0) + sum1();
//    }

    /*
     * sum numbers
     */
//    private static int sum2(List<Integer> ns) {
//        return sum2( ?, ?);
//    }
//
//    private static int sum2(List<Integer> ns, int acc) {
//        return ( ?)
//                ? ?
//                : ?;
//    }

    //TODO:reverse
//    /*
//     * reverse word
//     */
//    private static String reverse1(String s) {
//        return ( ?)
//                ? ?
//                : ?;
//    }
//
//    /*
//     * reverse word
//     */
//    private static String reverse2(String s) {
//        return reverse2( ?, ?);
//    }
//
//    private static String reverse2(String s, String acc) {
//        return ( ?)
//                ? ?
//                : ?;
//    }
}
