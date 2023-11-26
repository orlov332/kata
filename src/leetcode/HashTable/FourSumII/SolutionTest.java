package leetcode.HashTable.FourSumII;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void fourSumCount() {
        Solution solution = new Solution();
        int[] A = {1, 2};
        int[] B = {-2, -1};
        int[] C = {-1, 2};
        int[] D = {0, 2};
        assertEquals(2, solution.fourSumCount(A, B, C, D));
    }

    @Test
    void fourSumCount2() {
        Solution solution = new Solution();
        int[] A = {0};
        int[] B = {0};
        int[] C = {0};
        int[] D = {0};
        assertEquals(1, solution.fourSumCount(A, B, C, D));
    }

}
