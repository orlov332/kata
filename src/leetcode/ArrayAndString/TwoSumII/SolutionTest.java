package leetcode.ArrayAndString.TwoSumII;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

    public static Stream<Arguments> twoSum() {
        return Stream.of(
                Arguments.of(
                        new int[]{2, 7, 11, 15},
                        9,
                        new int[]{1, 2}),
                Arguments.of(
                        new int[]{2, 3, 4},
                        6,
                        new int[]{1, 3}),
                Arguments.of(
                        new int[]{-1, 0},
                        -1,
                        new int[]{1, 2})
        );
    }

    @ParameterizedTest(name = "numbers = {0}, target = {1}")
    @MethodSource
    void twoSum(int[] numbers, int target, int[] expected) {
        Solution solution = new Solution();
        int[] actual = solution.twoSum(numbers, target);
        assertArrayEquals(expected, actual);
    }
}
