public class BarkingDog {
    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay) {
        if (hourOfDay >= 0 && hourOfDay <= 23 && isBarking) {
            return hourOfDay < 8 || hourOfDay > 22;
        }
        return false;
    }
}
