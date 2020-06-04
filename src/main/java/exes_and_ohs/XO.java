//2020.05/29(Fri)
package exes_and_ohs;

import java.util.stream.Stream;

public class XO {
    public static void main(String[] args) {
        String str = "xoXORinu";
        System.out.println(getXO(str));
    }

    public static boolean getXO(String str) {
        // Good Luck!!
        String strToLower = str.toLowerCase();
        System.out.println(strToLower);
        //xだけ
        long numOfX = Stream.of(strToLower.split("")).filter(s -> s.equals("x")).count();
        //oだけ
        long numOfO = Stream.of(strToLower.split("")).filter(s -> s.equals("o")).count();
        return (numOfX == numOfO);
    }
}
