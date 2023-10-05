package leetcode.ArrayAndString.LongestCommonPrefix;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    public static Stream<Arguments> longestCommonPrefix() {
        return Stream.of(
                Arguments.of("fl", new String[]{"flower", "flow", "flight"}),
                Arguments.of("", new String[]{"dog", "racecar", "car"}),
                Arguments.of("a", new String[]{"a"})
        );
    }

    @ParameterizedTest(name = "longestCommonPrefix({0}) = {1}")
    @MethodSource
    void longestCommonPrefix(String expected, String[] strs) {
        Solution solution = new Solution();
        assertEquals(expected, solution.longestCommonPrefix(strs));
    }
}
