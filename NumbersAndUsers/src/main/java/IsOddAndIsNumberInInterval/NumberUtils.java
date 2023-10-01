package IsOddAndIsNumberInInterval;

public class NumberUtils {
    public static boolean evenOddNumber(int number) {
        return number % 2 == 0;
    }

    public static boolean numberInInterval(int number) {
        return number > 25 && number < 100;
    }
}
