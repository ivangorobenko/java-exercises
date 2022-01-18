public class BarkingDog {
    public static boolean shouldWakeUp(boolean isDogBarking, int currentHour) {
        if(isCurrentHourOutOfRange(currentHour)) return false;
        return isNight(currentHour) && isDogBarking;
    }

    private static boolean isCurrentHourOutOfRange(int currentHour) {
        return currentHour > 23 || currentHour < 0;
    }

    private static boolean isNight(int currentHour) {
        return currentHour < 8 || currentHour > 22;
    }
}
