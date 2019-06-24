public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        num1 = num1 * 1000;
        num2 = num2 * 1000;

        int number1 = (int) num1;
        int number2 = (int) num2;

        return number1 == number2;
    }
}
