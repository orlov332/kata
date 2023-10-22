package leetcode.ArrayAndString.RotateArray;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

    public static Stream<Arguments> rotate() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 5, 6, 7}, 3, new int[]{5, 6, 7, 1, 2, 3, 4}),
                Arguments.of(new int[]{-1, -100, 3, 99}, 2, new int[]{3, 99, -1, -100})
        );
    }

    @ParameterizedTest(name = "nums: {0}, k: {1}, expected: {2}")
    @MethodSource
    void rotate(int[] nums, int k, int[] expected) {
        new Solution().rotate(nums, k);
        assertArrayEquals(expected, nums);
    }
}
