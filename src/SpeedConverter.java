public class SpeedConverter {

    private static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour >= 0) {
            return Math.round(kilometersPerHour / 1.609);
        }
        return -1;
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour > 0) {
            long speed = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + speed + " mi/h");
        } else {
            System.out.println("Invalid Value");
        }
    }
}
