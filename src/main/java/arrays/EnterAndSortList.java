package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class EnterAndSortList {
    public static Integer[] sortIntegers(Integer[] intList) {

        Arrays.sort(intList, Collections.reverseOrder());
        return intList;
    }

    public static Integer[] enterList() {
        Scanner scanner = new Scanner(System.in);
        Integer[] intList = new Integer[5];
        for (int i = 0; i < intList.length; i++) {
            intList[i] = scanner.nextInt();
        }
        return intList;
    }

    public static void printList(Integer[] sortedList) {
        Arrays.stream(sortedList).forEach(intElement -> System.out.println(intElement));
    }
}
