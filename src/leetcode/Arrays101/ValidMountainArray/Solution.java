package leetcode.Arrays101.ValidMountainArray;

class Solution {
    public boolean validMountainArray(int[] arr) {
        int leftUp = 0;
        int rightUp = arr.length - 1;
        while (leftUp < arr.length - 1 && arr[leftUp] < arr[leftUp + 1]) {
            leftUp++;
        }
        while (rightUp > 0 && arr[rightUp] < arr[rightUp - 1]) {
            rightUp--;
        }
        return leftUp == rightUp && leftUp != 0 && rightUp != arr.length - 1;
    }
}
