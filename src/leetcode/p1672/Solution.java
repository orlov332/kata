package leetcode.p1672;

import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int maximumWealth(int[][] accounts) {
        return Arrays.stream(accounts)
                .mapToInt(account -> IntStream.of(account).sum())
                .max()
                .orElse(0);
    }
}
