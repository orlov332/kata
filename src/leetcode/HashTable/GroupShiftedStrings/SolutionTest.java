package leetcode.HashTable.GroupShiftedStrings;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class SolutionTest {

    @Test
    void groupStrings() {
        Solution solution = new Solution();
        String[] strings = {"abc", "bcd", "acef", "xyz", "az", "ba", "a", "z"};

        List<List<String>> result = solution.groupStrings(strings);

        assertEquals(4, result.size());
        assertIterableEquals(List.of(
                List.of("a", "z"),
                List.of("az", "ba"),
                List.of("abc", "bcd", "xyz"),
                List.of("acef")
        ), result);
    }
}
