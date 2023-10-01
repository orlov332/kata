package leetcode.p412;

import java.util.List;
import java.util.stream.IntStream;

class Solution {
    public List<String> fizzBuzz(int n) {
        return IntStream.range(1, n + 1)
                .mapToObj(i -> {
                    if (i % 15 == 0) return "FizzBuzz";
                    if (i % 3 == 0) return "Fizz";
                    if (i % 5 == 0) return "Buzz";
                    return String.valueOf(i);
                })
                .toList();
    }
}
