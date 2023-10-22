package leetcode.ArrayAndString.MinimumSizeSubarraySum;

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int result = Integer.MAX_VALUE;
        int sum = 0;
        int start = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum >= target) {
                result = Math.min(result, i - start + 1);
                sum -= nums[start++];
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }
}
