package leetcode.ArrayAndString.PascalsTriangleII;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    public static Stream<Arguments> getRow() {
        return Stream.of(
                Arguments.of(30, List.of(1, 30, 435, 4060, 27405, 142506, 593775, 2035800, 5852925, 14307150, 30045015, 54627300, 86493225, 119759850, 145422675, 155117520, 145422675, 119759850, 86493225, 54627300, 30045015, 14307150, 5852925, 2035800, 593775, 142506, 27405, 4060, 435, 30, 1)),
                Arguments.of(4, List.of(1, 4, 6, 4, 1)),
                Arguments.of(9, List.of(1, 9, 36, 84, 126, 126, 84, 36, 9, 1)),
                Arguments.of(1, List.of(1, 1)),
                Arguments.of(0, List.of(1))
        );
    }

    @ParameterizedTest(name = "rowIndex = {0}")
    @MethodSource
    void getRow(int rowIndex, List<Integer> expected) {
        Solution solution = new Solution();
        List<Integer> result = solution.getRow(rowIndex);
        assertEquals(expected, result);
    }

}
