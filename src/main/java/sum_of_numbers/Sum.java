package sum_of_numbers;

import java.util.stream.IntStream;

public class Sum {
    public static void main(String[] args) {
        int a = 6;
        int b = 4;
        System.out.println(GetSum(a, b));
    }

    public static int GetSum(int a, int b) {
        //Good luck!
        return IntStream.rangeClosed(Math.min(a, b),Math.max(a,b)).sum();
    }
}
