package growth_of_a_population;

public class Arge {
    public static void main(String[] args) {
        int p0 = 1500000;
        double percent = 2.5;
        int aug = 10000;
        int p = 2000000;
        System.out.println(nbYear(p0, percent, aug, p));
    }

    private static int countYear = 0;

    public static int nbYear(int p0, double percent, int aug, int p) {
        // your code
        int people = (int) (p0 + p0 * (percent / 100) + aug);
        countYear++;
        if (people < p) {
            return nbYear(people, percent, aug, p);
        }
        int result = countYear;
        countYear = 0;
        return result;
    }
}
