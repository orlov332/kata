package leetcode.arrays101.FindNumbersWithEvenNumberofDigits;

import java.util.stream.IntStream;

class Solution {
    public int findNumbers(int[] nums) {
        return (int) IntStream.of(nums)
                .map(num -> String.valueOf(num).length() % 2 == 0 ? 1 : 0)
                .sum();
    }
}
