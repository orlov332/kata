package leetcode.HashTable.FourSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for (int first = 0; first < nums.length - 3; first++) {
            if (first > 0 && nums[first - 1] == nums[first]) continue;
            for (int second = first + 1; second < nums.length - 2; second++) {
                if (second > first + 1 && nums[second - 1] == nums[second]) continue;

                int left = second + 1;
                int right = nums.length - 1;

                while (left < right) {
                    long sum = (long) nums[first] + nums[second] + nums[left] + nums[right];
                    if (sum > target) {
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        result.add(List.of(nums[first], nums[second], nums[left++], nums[right--]));
                        while (left < right && nums[left] == nums[left - 1])
                            ++left;
                    }
                }
            }
        }

        return result;
    }
}
