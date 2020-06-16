package find_the_odd_int;

import java.util.Arrays;

/***
 Given an array, find the integer that appears an odd number of times.

 There will always be only one integer that appears an odd number of times.
 ***/

public class FindOdd {
    public static void main(String[] args) {
        int[] a = {-1, 1, 2, 1, -1, 6, 6};
        System.out.println(findIt(a));
    }

    public static int findIt(int[] a) {
        int[] distinct = Arrays.stream(a).distinct().toArray();
        int result = 0;

        for (int Distinct : distinct) {
            int count = 0;
            for (int A : a) {
                if (Distinct == A) {
                    count++;
                }
            }
            if (count % 2 == 1) {
                result = Distinct;
                break;
            }
        }
        return result;
    }
}
