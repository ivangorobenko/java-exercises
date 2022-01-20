package arrays;


import java.util.Arrays;

public class MinElementInArray {

    public static int findMinValue(int[] intArray) {
        return Arrays.stream(intArray)
                .min()
                .getAsInt();
    }
}
