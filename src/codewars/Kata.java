package codewars;

import java.text.MessageFormat;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Kata {
    public static String createPhoneNumber(int[] numbers) {
        return MessageFormat.format("({0}) {1}-{2}",
                Arrays.stream(numbers, 0, 3)
                        .mapToObj(Integer::toString)
                        .collect(Collectors.joining()),
                Arrays.stream(numbers, 3, 6)
                        .mapToObj(Integer::toString)
                        .collect(Collectors.joining()),
                Arrays.stream(numbers, 6, 10)
                        .mapToObj(Integer::toString)
                        .collect(Collectors.joining())
        );
    }
}
