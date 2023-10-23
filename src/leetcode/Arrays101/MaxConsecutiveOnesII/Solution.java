package leetcode.Arrays101.MaxConsecutiveOnesII;

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxSeq = 0;
        int left = 0;
        int right = 0;
        int zeroIndex = -1;

        while (right < nums.length) {
            if (nums[right] == 0) {
                if (zeroIndex >= 0) {
                    left = zeroIndex + 1;
                }
                zeroIndex = right;
            }

            maxSeq = Math.max(maxSeq, right - left + 1);
            right++;
        }
        return maxSeq;
    }
}
