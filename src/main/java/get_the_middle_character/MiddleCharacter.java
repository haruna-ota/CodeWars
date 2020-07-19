//2020.05/30(Sat)
package get_the_middle_character;

public class MiddleCharacter {
    public static void main(String[] args) {
        String word = "test";
        System.out.println(getMiddle(word));
    }

    public static String getMiddle(String word) {
        //Code goes here!
        int wordCount = word.length();

        if (wordCount / 2 == 0) {
            return word.substring(0, 1);
        } else if (wordCount % 2 == 0) {
            return word.substring(wordCount / 2 - 1, wordCount / 2 + 1);
        } else {
            return word.substring(wordCount / 2, wordCount / 2 + 1);
        }
    }
}
