import java.util.stream.Stream;

public class TeenNumberChecker {
    public static boolean hasTeen(int number1, int number2, int number3) {
        return Stream.of(number1, number2, number3).anyMatch(number -> number >= 13 && number <= 19);
    }

    private static boolean isTeen(int number){
        return number >= 13 && number <= 19;
    }
}
