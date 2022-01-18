import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(Double doubleToCompare, Double anotherDoubleToCompare) {
        DecimalFormatSymbols otherSymbols = new DecimalFormatSymbols(Locale.FRANCE);
        otherSymbols.setDecimalSeparator('.');
        DecimalFormat df = new DecimalFormat("#.###", otherSymbols);
        df.setRoundingMode(RoundingMode.DOWN);
        Double roundedDoubleToCompare = Double.parseDouble(df.format(doubleToCompare));
        Double roundedAnotherDoubleToCompare = Double.parseDouble(df.format(anotherDoubleToCompare));
        return roundedDoubleToCompare.compareTo(roundedAnotherDoubleToCompare) == 0;
    }
}