package find_the_odd_int;

import java.util.*;
import java.util.stream.Collectors;

/***
 GroupingByを使って書いてみる
 Given an array, find the integer that appears an odd number of times.

 There will always be only one integer that appears an odd number of times.
 ***/

public class FindOddWithGroupingBy {
    public static void main(String[] args) {
        int[] a = {-1, 1, 2, 1, -1, 6, 6};
        System.out.println(findIt(a));

    }

    public static int findIt(int[] a) {
        Map<Integer, Long> map = Arrays.stream(a).boxed().collect(Collectors.groupingBy(i -> i, Collectors.counting()));

        int result = map.entrySet().stream().filter(e -> e.getValue() % 2 == 1).map(e -> e.getKey()).findFirst().get();

        return result;
    }
}
