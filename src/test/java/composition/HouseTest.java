package composition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class HouseTest {
    @Test
    public void should_be_able_to_clean_house() {
        //GIVEN
        Room room = new Room(true);
        Kitchen kitchen = new Kitchen(true,2,true);
        House house = new House(room, kitchen);

        //WHEN
        house.clean();

        //THEN
        assertTrue(house.isClean());
    }
}