package leetcode.HashTable.FourSumII;

import java.util.HashMap;

class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int count = 0;
        var twoSumAppearance = new HashMap<Integer, Integer>(nums4.length);
        for (int value1 : nums1) {
            for (int value2 : nums2) {
                twoSumAppearance.compute(value1 + value2, (k, v) -> v == null ? 1 : v + 1);
            }
        }

        for (int value3 : nums3) {
            for (int value4 : nums4) {
                count += twoSumAppearance.getOrDefault(-(value3 + value4), 0);
            }
        }
        return count;
    }
}
