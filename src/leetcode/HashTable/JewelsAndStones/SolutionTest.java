package leetcode.HashTable.JewelsAndStones;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void numJewelsInStones() {
        Solution solution = new Solution();
        assertEquals(3, solution.numJewelsInStones("aA", "aAAbbbb"));
        assertEquals(0, solution.numJewelsInStones("z", "ZZ"));
        assertEquals(1, solution.numJewelsInStones("a", "aAAbbbb"));
        assertEquals(0, solution.numJewelsInStones("a", "b"));
        assertEquals(0, solution.numJewelsInStones("a", "bb"));
        assertEquals(1, solution.numJewelsInStones("a", "ab"));
        assertEquals(1, solution.numJewelsInStones("a", "bab"));
        assertEquals(2, solution.numJewelsInStones("a", "babab"));
        assertEquals(3, solution.numJewelsInStones("a", "bababa"));
        assertEquals(3, solution.numJewelsInStones("a", "bababab"));
        assertEquals(4, solution.numJewelsInStones("a", "babababa"));
    }
}
