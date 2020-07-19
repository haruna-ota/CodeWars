package descending_order;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class DescendingOrder {
    public static void main(String[] args) {
        int num = 21445;
        System.out.println(sortDesc(num));
    }

    public static int sortDesc(final int num) {
        //Your code
        String[] strNumber = String.valueOf(num).split("");
        int[] intNumber = Arrays.stream(strNumber).mapToInt(Integer::parseInt).toArray();
        Object[] sortedNumber = Arrays.stream(intNumber).boxed().sorted(Comparator.reverseOrder()).toArray();
        return Integer.parseInt(Arrays.stream(sortedNumber).map(String::valueOf).collect(Collectors.joining("")));
    }
}
