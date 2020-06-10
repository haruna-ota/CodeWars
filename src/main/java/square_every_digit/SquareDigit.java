package square_every_digit;


import java.util.Arrays;
import java.util.stream.Collectors;

public class SquareDigit {

    public static void main(String[] args) {
        int n = 9119;
        System.out.println(squareDigits(n));
    }

    public static int squareDigits(int n) {
        // TODO Implement me
        String[] stringNumber = String.valueOf(n).split("");
        int[] power = Arrays.stream(stringNumber).mapToInt(Integer::parseInt).map(num -> (int) Math.pow(num, 2)).toArray();
        return Integer.parseInt(Arrays.stream(power).mapToObj(String::valueOf).collect(Collectors.joining("")));
    }
}
