public class IntEqualityPrinter {

    public static void printEqual(int x, int y, int z) {
        String message = "Neither all are equal or different";
        if (x < 0 || y < 0 || z < 0) {
            message = "Invalid Value";
        } else if (x == y && x == z) {
            message = "All numbers are equal";
        } else if (x != y && x != z && y != z) {
            message = "All numbers are different";
        }
        System.out.println(message);
    }
}
