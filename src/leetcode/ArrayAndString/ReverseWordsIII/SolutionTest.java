package leetcode.ArrayAndString.ReverseWordsIII;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @ParameterizedTest(name = "reverseWords({0}) = {1}")
    @CsvSource(value = {
            "Let's take LeetCode contest,s'teL ekat edoCteeL tsetnoc",
            "God Ding,doG gniD",
    })
    void reverseWords(String string, String expected) {
        Solution solution = new Solution();
        assertEquals(expected, solution.reverseWords(string));
    }
}
