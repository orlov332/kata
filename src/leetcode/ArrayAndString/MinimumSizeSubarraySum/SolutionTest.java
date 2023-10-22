package leetcode.ArrayAndString.MinimumSizeSubarraySum;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    public static Stream<Arguments> minSubArrayLen() {
        return Stream.of(
                Arguments.of(7, new int[]{2, 3, 1, 2, 4, 3}, 2),
                Arguments.of(4, new int[]{1, 4, 4}, 1),
                Arguments.of(11, new int[]{1, 1, 1, 1, 1, 1, 1}, 0)
        );
    }

    @ParameterizedTest(name = "target = {0}, nums = {1}, expected = {2}")
    @MethodSource
    void minSubArrayLen(int target, int[] nums, int expected) {
        assertEquals(expected, new Solution().minSubArrayLen(target, nums));
    }
}
