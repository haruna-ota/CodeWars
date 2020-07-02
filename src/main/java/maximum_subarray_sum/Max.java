package maximum_subarray_sum;

/***
 * The maximum sum subarray problem consists in finding the maximum sum of a contiguous subsequence in an array or list of integers:
 *
 * Max.sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
 * // should be 6: {4, -1, 2, 1}
 * Easy case is when the list is made up of only positive numbers and the maximum sum is the sum of the whole array. If the list is made up of only negative numbers, return 0 instead.
 *
 * Empty list is considered to have zero greatest sum. Note that the empty list or array is also a valid sublist/subarray.
 ***/

public class Max {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(sequence(arr));
    }

    public static int sequence(int[] arr) {
        if (arr.length == 0) {
            return 0;
        } else {
            int result = 0;
            for (int i = 0; i < arr.length; i++) {
                int sum = 0;
                for (int j = i; j < arr.length; j++) {
                    sum = sum + arr[j];
                    System.out.println("s:" + sum);
                    if (sum >= result) {
                        result = sum;
                    }
                    System.out.println("r:" + result);
                }
            }
            return result;
        }
    }
}
