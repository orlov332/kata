package leetcode.ArrayAndString.ArrayPartitionI;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    public static Stream<Arguments> arrayPairSum() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4}, 4),
                Arguments.of(new int[]{6, 2, 6, 5, 1, 2}, 9)
        );
    }

    @ParameterizedTest(name = "nums = {0}, expected = {1}")
    @MethodSource
    void arrayPairSum(int[] nums, int expected) {
        Solution solution = new Solution();
        assertEquals(expected, solution.arrayPairSum(nums));
    }
}
