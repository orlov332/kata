package leetcode.arrays101.FindAllNumbersDisappearedInArray;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int key = Math.abs(nums[i]) - 1;
            if (nums[key] > 0) {
                nums[key] = -nums[key];
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }

        return result;
    }
}
