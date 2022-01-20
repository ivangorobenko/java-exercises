package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnterAndSortListTest {

    @Test
    public void should_sort_list_desc() {
        //GIVEN
        Integer[] intList = {1, 5, 3, 9, 4};
        Integer[] expectedIntList = {9, 5, 4, 3, 1};

        //WHEN
        Integer[] sortedIntList = EnterAndSortList.sortIntegers(intList);

        //THEN
        assertArrayEquals(expectedIntList, sortedIntList);
    }

}