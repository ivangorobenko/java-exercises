import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearTest {

    @Test
    public void should_not_be_leap_ear_if_is_out_of_range() {
        //GIVEN
        Map<Integer, Boolean> years = new HashMap<>();
        years.put(0, false);
        years.put(10000, false);

        years.forEach((year, expectedIsLeapYear) -> {
            //WHEN
            boolean determinedIsLeapYear = LeapYear.isLeapYear(year);
            //THEN
            assertEquals(determinedIsLeapYear, expectedIsLeapYear);
        });
    }

    @Test
    public void should_return_true_when_year_is_leap() {
        //GIVEN
        Map<Integer, Boolean> years = new HashMap<>();
        years.put(1600, true);
        years.put(2000, true);
        years.put(2400, true);

        years.forEach((year, expectedIsLeapYear) -> {
            //WHEN
            boolean determinedIsLeapYear = LeapYear.isLeapYear(year);
            //THEN
            assertEquals(determinedIsLeapYear, expectedIsLeapYear);
        });
    }

    @Test
    public void should_return_false_when_year_is_not_leap() {
        //GIVEN
        Map<Integer, Boolean> years = new HashMap<>();
        years.put(1800, false);
        years.put(1900, false);
        years.put(2100, false);
        years.put(2200, false);

        years.forEach((year, expectedIsLeapYear) -> {
            //WHEN
            boolean determinedIsLeapYear = LeapYear.isLeapYear(year);
            //THEN
            assertEquals(determinedIsLeapYear, expectedIsLeapYear);
        });
    }


}