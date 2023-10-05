package leetcode.ArrayAndString.PascalsTriangle;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    public static Stream<Arguments> generate() {
        return Stream.of(
                Arguments.of(
                        5,
                        List.of(
                                List.of(1),
                                List.of(1, 1),
                                List.of(1, 2, 1),
                                List.of(1, 3, 3, 1),
                                List.of(1, 4, 6, 4, 1)
                        )),
                Arguments.of(
                        10,
                        List.of(
                                List.of(1),
                                List.of(1, 1),
                                List.of(1, 2, 1),
                                List.of(1, 3, 3, 1),
                                List.of(1, 4, 6, 4, 1),
                                List.of(1, 5, 10, 10, 5, 1),
                                List.of(1, 6, 15, 20, 15, 6, 1),
                                List.of(1, 7, 21, 35, 35, 21, 7, 1),
                                List.of(1, 8, 28, 56, 70, 56, 28, 8, 1),
                                List.of(1, 9, 36, 84, 126, 126, 84, 36, 9, 1)
                        )),
                Arguments.of(1, List.of(List.of(1)))
        );
    }

    @ParameterizedTest(name = "numRows = {0}")
    @MethodSource
    void generate(int numRows, List<List<Integer>> expected) {
        Solution solution = new Solution();
        List<List<Integer>> result = solution.generate(numRows);
        assertEquals(expected, result);
    }
}
