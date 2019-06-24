public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {
        boolean result = true;
        if (!summer) {
            if (temperature < 25 || temperature > 35) {
                result = false;
            }
        } else {
            if (temperature < 25 || temperature > 45) {
                result = false;
            }
        }
        return result;
    }
}
