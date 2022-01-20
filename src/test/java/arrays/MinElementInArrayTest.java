package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinElementInArrayTest {

    @Test
    void should_return_min_value_int_list() {
        //GIVEN
        int[] intArray = new int[]{5, 2, 3, 4};
        int expectedMinValue = 2;

        //WHEN
        int result = MinElementInArray.findMinValue(intArray);

        //THEN
        assertEquals(expectedMinValue, result);
    }
}