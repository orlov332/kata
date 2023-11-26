package leetcode.HashTable.FourSum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    @Test
    void fourSum() {
        int[] nums = {1000000000, 1000000000, 1000000000, 1000000000};
        Solution solution = new Solution();
        assertTrue(solution.fourSum(nums, -294967296).isEmpty());
    }
}
