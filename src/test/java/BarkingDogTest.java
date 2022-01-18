import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class BarkingDogTest {


    @Test
    public void should_wake_up_at_night() {
        //GIVEN
        Map<Integer, Boolean> kms = new HashMap<>();
        kms.put(1, true);
        kms.put(7, true);
        kms.put(9, false);
        kms.put(8, false);
        kms.put(23, true);
        kms.put(24, false);
        kms.put(-1, false);


        kms.forEach((currentHour, expectedShouldWakeUp) -> {
            //WHEN
            boolean calculatedShouldWakeUp = BarkingDog.shouldWakeUp(true, currentHour);
            //THEN
            assertEquals(calculatedShouldWakeUp, expectedShouldWakeUp);
        });
    }

    @Test
    public void should_not_bark_if_hour_is_not_valid() {
        //GIVEN
        Map<Integer, Boolean> kms = new HashMap<>();
        kms.put(24, false);
        kms.put(-1, false);


        kms.forEach((currentHour, expectedShouldWakeUp) -> {
            //WHEN
            boolean calculatedShouldWakeUp = BarkingDog.shouldWakeUp(true, currentHour);
            //THEN
            assertEquals(calculatedShouldWakeUp, expectedShouldWakeUp);
        });
    }

    @Test
    public void should_not_wake_up_if_dog_is_not_barking() {
        //GIVEN


        //WHEN
        boolean calculatedShouldWakeUp = BarkingDog.shouldWakeUp(false, 1);
        //THEN
        assertFalse(calculatedShouldWakeUp);
    }
}
