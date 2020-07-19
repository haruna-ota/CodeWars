//2020.05/31(Sun)
package find_the_parity_outlier;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FindOutlier {
    public static void main(String[] args) {
        int[] integers = {-2, -3, 2, 4, 6, 8, -10};
        System.out.println(find(integers));
    }

    static int find(int[] integers) {
        int[] arrayOfOdd = IntStream.of(integers).filter(i -> Math.abs(i % 2) == 1).toArray();
        System.out.println(Arrays.toString(arrayOfOdd));
        System.out.println(arrayOfOdd.length);
        int[] arrayOfEven = IntStream.of(integers).filter(i -> Math.abs(i % 2) == 0).toArray();
        System.out.println(Arrays.toString(arrayOfEven));
        System.out.println(arrayOfEven.length);

        if (arrayOfOdd.length < arrayOfEven.length) {
            return arrayOfOdd[0];
        } else {
            return arrayOfEven[0];
        }
    }
}
