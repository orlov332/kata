package leetcode.ArrayAndString.SpiralMatrix;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    static Stream<Arguments> spiralOrder() {
        return Stream.of(
                Arguments.of(
                        new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},
                        List.of(1, 2, 3, 6, 9, 8, 7, 4, 5)),
                Arguments.of(
                        new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}},
                        List.of(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7)),
                Arguments.of(
                        new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}},
                        List.of(1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10)),
                Arguments.of(
                        new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}, {17, 18, 19, 20}},
                        List.of(1, 2, 3, 4, 8, 12, 16, 20, 19, 18, 17, 13, 9, 5, 6, 7, 11, 15, 14, 10)),
                Arguments.of(
                        new int[][]{{1, 2, 3, 4}},
                        List.of(1, 2, 3, 4)),
                Arguments.of(
                        new int[][]{{1}, {2}, {3}, {4}},
                        List.of(1, 2, 3, 4))
        );
    }

    @ParameterizedTest(name = "matrix = {0}")
    @MethodSource
    void spiralOrder(int[][] matrix, List<Integer> result) {
        Solution solution = new Solution();
        assertEquals(result, solution.spiralOrder(matrix));
    }
}
