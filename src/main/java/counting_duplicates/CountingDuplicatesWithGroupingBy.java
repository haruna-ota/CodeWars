package counting_duplicates;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/***
 Count the number of Duplicates
 Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric digits that occur more than once in the input string. The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.

 Example
 "abcde" -> 0 # no characters repeats more than once
 "aabbcde" -> 2 # 'a' and 'b'
 "aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
 "indivisibility" -> 1 # 'i' occurs six times
 "Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
 "aA11" -> 2 # 'a' and '1'
 "ABBA" -> 2 # 'A' and 'B' each occur twice
 ***/

public class CountingDuplicatesWithGroupingBy {
    public static void main(String[] args) {
        String text = "aabbcde";
        System.out.println(duplicateCount(text));

    }

    public static int duplicateCount(String text) {
        // Write your code here
        Map<String, Long> map = Stream.of(text.toLowerCase().split("")).collect(Collectors.groupingBy(s -> s, Collectors.counting()));
//        System.out.println(map);
        return (int) map.entrySet().stream().filter(e -> e.getValue() > 1).count();
    }
}
