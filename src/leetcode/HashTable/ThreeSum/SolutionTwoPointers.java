package leetcode.HashTable.ThreeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class SolutionTwoPointers {

    public static final int TARGET_SUM = 0;

    public List<List<Integer>> threeSum(int[] nums) {
        int target = TARGET_SUM;
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] > 0) break;
            if (i > 0 && nums[i - 1] == nums[i]) continue;
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == target) {
                    result.add(List.of(nums[i], nums[left++], nums[right--]));
                    while (left < right && nums[left] == nums[left - 1])
                        ++left;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;
    }
}
