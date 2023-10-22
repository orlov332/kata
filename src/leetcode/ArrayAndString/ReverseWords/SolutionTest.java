package leetcode.ArrayAndString.ReverseWords;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @ParameterizedTest(name = "srt = {0}")
    @CsvSource(value = {
            "the sky is blue, blue is sky the",
            "  hello world!  ,world! hello",
            "a good   example, example good a",
            "  Bob    Loves  Alice   ,Alice Loves Bob",
            "Alice does not even like bob,bob like even not does Alice",
            "  Bob    Loves  Alice   ,Alice Loves Bob",
            "Alice does not even like bob,bob like even not does Alice"})
    void reverseWords(String str, String expected) {
        assertEquals(expected, new Solution().reverseWords(str));
    }
}
