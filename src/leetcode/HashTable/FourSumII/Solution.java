package leetcode.HashTable.FourSumII;

class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int count = 0;

        for (int value1 : nums1) {
            int sum = value1;
            for (int value2 : nums2) {
                sum += value2;
                for (int value3 : nums3) {
                    sum += value3;
                    for (int value4 : nums4) {
                        if (sum + value4 == 0) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}
