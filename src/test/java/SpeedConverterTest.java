import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpeedConverterTest {
    @Test
    public void should_convert_from_km_to_miles_per_hour() {
        //GIVEN
        Map<Double, Long> kms = new HashMap<>();
        kms.put(1.5, (long) 1);
        kms.put(10.25, (long) 6);
        kms.put(25.42, (long) 16);
        kms.put(75.114, (long) 47);

        kms.forEach((km, expectedMile) -> {
            //WHEN
            long calculatedMiles = SpeedConverter.toMilesPerHour(km);
            //THEN
            assertEquals(calculatedMiles, expectedMile);
        });

    }

    @Test
    public void should_return_invalid_value_if_negatif_km() {
        //GIVEN
        var km = -1.5;

        //WHEN
        var miles = SpeedConverter.toMilesPerHour(km);

        //THEN
        assertEquals(-1, miles);
    }

    @Test
    public void should_print_speed_converter_result() {
        //GIVEN
        var km = 1.5;

        //WHEN
        var printResult = SpeedConverter.printConversion(km);

        //THEN
        assertEquals("1.5 km/h = 1 mi/h", printResult);
    }

    @Test
    public void should_print_an_error_if_km_value_is_not_valid() {
        //GIVEN
        var km = -1.5;

        //WHEN
        var printResult = SpeedConverter.printConversion(km);

        //THEN
        assertEquals("Invalid Value", printResult);
    }
}
