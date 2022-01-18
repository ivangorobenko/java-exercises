import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class TeenNumberCheckerTest {

    @Test
    public void should_indicate_when_there_is_a_teen_number_in_a_list() {
        //GIVEN
        Map<List<Integer>, Boolean> numbersWithAssertion = new HashMap<>();
        numbersWithAssertion.put(List.of(1, 13, 2), true);
        numbersWithAssertion.put(List.of(1, 18, 2), true);
        numbersWithAssertion.put(List.of(1, 19, 2), true);

        numbersWithAssertion.forEach((numbers, expectedResult) -> {
            //WHEN
            boolean determinedResult = TeenNumberChecker.hasTeen(numbers.get(0), numbers.get(1), numbers.get(2));
            //THEN
            assertEquals(determinedResult, expectedResult);
        });
    }

    @Test
    public void should_indicate_when_there_is_NO_teen_number_in_a_list() {
        //GIVEN
        Map<List<Integer>, Boolean> numbersWithAssertion = new HashMap<>();
        numbersWithAssertion.put(List.of(1, 20, 2), false);
        numbersWithAssertion.put(List.of(1, 12, 2), false);

        numbersWithAssertion.forEach((numbers, expectedResult) -> {
            //WHEN
            boolean determinedResult = TeenNumberChecker.hasTeen(numbers.get(0), numbers.get(1), numbers.get(2));
            //THEN
            assertEquals(determinedResult, expectedResult);
        });
    }
}