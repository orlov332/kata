package leetcode.arrays101.RemoveDuplicatesFromSortedArray;

class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int item : nums)
            if (i < 1 || item > nums[i - 1]) {
                nums[i] = item;
                i++;
            }
        return i;
    }
}
