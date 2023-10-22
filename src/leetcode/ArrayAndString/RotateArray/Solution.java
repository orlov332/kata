package leetcode.ArrayAndString.RotateArray;

class Solution {
    public void rotate(int[] nums, int k) {
        if (k == 0 || k % nums.length == 0)
            return;

        int shift = k % nums.length;
        int count = 0;
        int currentIndex = 0;
        int startPoint = 0;
        int currentValue = nums[0];
        while (count < nums.length) {
            currentIndex = (currentIndex + shift) % nums.length;
            int temp = nums[currentIndex];
            nums[currentIndex] = currentValue;
            if (currentIndex == startPoint) {
                startPoint++;
                currentIndex++;
                currentValue = nums[currentIndex];
            } else {
                currentValue = temp;
            }
            count++;
        }

    }
}
