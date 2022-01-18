public class LeapYear {
    public static boolean isLeapYear(int year) {
        if (isYearOutOfRange(year)) return false;
        return isYearDivisibleBy4And100And400(year);
    }

    private static boolean isYearDivisibleBy4And100And400(int year) {
        return year % 4 == 0 && year % 100 == 0 && year % 400 == 0;
    }

    private static boolean isYearOutOfRange(int year) {
        return year < 1 || year > 9999;
    }
}
