package leetcode.HashTable.FourSumII;

class SolutionBF {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int count = 0;

        for (int value1 : nums1) {
            for (int value2 : nums2) {
                for (int value3 : nums3) {
                    for (int value4 : nums4) {
                        if (value1 + value2 + value3 + value4 == 0) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}
