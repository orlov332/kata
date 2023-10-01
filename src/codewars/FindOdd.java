package codewars;

import java.util.Arrays;
import java.util.Map.Entry;
import java.util.function.Function;

import static java.util.stream.Collectors.groupingBy;

public class FindOdd {
    public static int findIt(int[] a) {
        return Arrays.stream(a).boxed()
                .collect(groupingBy(Function.identity()))
                .entrySet().stream()
                .filter(e -> e.getValue().size() % 2 != 0)
                .findFirst()
                .map(Entry::getKey)
                .orElse(0);
    }
}
