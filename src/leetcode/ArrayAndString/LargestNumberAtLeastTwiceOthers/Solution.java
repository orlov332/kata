package leetcode.ArrayAndString.LargestNumberAtLeastTwiceOthers;

class Solution {
    public int dominantIndex(int[] nums) {
        int maxIndex = 0;
        int secondIndex = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[maxIndex]) {
                secondIndex = maxIndex;
                maxIndex = i;
            } else if (nums[i] > nums[secondIndex]) {
                secondIndex = i;
            }
        }
        return nums[maxIndex] >= (nums[secondIndex] * 2) ? maxIndex : -1;
    }
}
