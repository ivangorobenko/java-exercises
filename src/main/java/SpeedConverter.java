public class SpeedConverter {
    public static long toMilesPerHour(double km) {
        if (km < 0) return -1;
        return Math.round(km * 0.6215);
    }

    public static String printConversion(double km) {
        long calculatedMiles = toMilesPerHour(km);
        if (calculatedMiles == -1) return "Invalid Value";
        String kmToPrint = convertToPrintingFormat(km, "km/h");
        String milesToPrint = convertToPrintingFormat(calculatedMiles, "mi/h");
        return kmToPrint + " = " + milesToPrint;
    }

    private static String convertToPrintingFormat(double value, String measure) {
        return value + " " + measure;
    }
}
