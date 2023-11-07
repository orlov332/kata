package leetcode.HashTable.LongestSubstringWithoutRepeatingCharacters;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @ParameterizedTest
    @CsvSource({
            "abcabcbb, 3",
            "bbbbb, 1",
            "pwwkew, 3",
            "dvdf, 3",
            "anviaj, 5",
            "ohomm, 3",
            "bbtablud, 6",
            "abcabcbb, 3"
    })
    void lengthOfLongestSubstring(String string, int expectedLength) {
        Solution solution = new Solution();
        assertEquals(expectedLength, solution.lengthOfLongestSubstring(string));
    }
}
