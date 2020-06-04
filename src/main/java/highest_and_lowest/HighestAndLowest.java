//2020.06/01(Mon)
package highest_and_lowest;

import java.util.stream.Stream;

public class HighestAndLowest {
    public static void main(String[] args) {
        String numbers = "1 2 -3 4 5";
        System.out.println(highAndLow(numbers));
    }

    public static String highAndLow(String numbers) {
        // Code here or
        int highest = Stream.of(numbers.split(" ")).mapToInt(Integer::parseInt).max().getAsInt();
        int lowest = Stream.of(numbers.split(" ")).mapToInt(Integer::parseInt).min().getAsInt();
        return String.join(" ", String.valueOf(highest), String.valueOf(lowest));
    }
}
