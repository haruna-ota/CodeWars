package you_are_a_square;

public class Square {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(isSquare(n));
    }

    public static boolean isSquare(int n) {
        double squareNum = Math.sqrt(n);
        return isInteger(squareNum); // fix me!
    }

    private static boolean isInteger(double squareNum) {
        return squareNum == Math.floor(squareNum);
    }
}
