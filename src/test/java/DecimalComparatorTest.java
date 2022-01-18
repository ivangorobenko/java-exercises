import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DecimalComparatorTest {
    @Test
    public void should_be_equal_if_two_double_numbers_are_the_same_up_to_3_decimals() {
        //GIVEN
        Map<List<Double>, Boolean> doublesToCompareWithAssertion = new HashMap<>();
        doublesToCompareWithAssertion.put(List.of(1.23, 1.23), true);
        doublesToCompareWithAssertion.put(List.of(1.2332, 1.233), true);
        doublesToCompareWithAssertion.put(List.of(3.175,3.176), false);
        doublesToCompareWithAssertion.put(List.of(-3.1756,-3.175), true);
        doublesToCompareWithAssertion.put(List.of(3.0,3.0), true);


        doublesToCompareWithAssertion.forEach((decimals, expectedIsEqual) -> {
            //WHEN
            boolean determinedIsEqual = DecimalComparator.areEqualByThreeDecimalPlaces(decimals.get(0), decimals.get(1));
            //THEN
            assertEquals(expectedIsEqual, determinedIsEqual);
        });
    }

}