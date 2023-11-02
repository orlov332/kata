package leetcode.HashTable.IntersectionTwoArraysII;

import java.util.Arrays;

class Solution {

    public static final int ITEM_MAX_VALUE = 1000;
    public static final int ITEM_MIN_VALUE = 0;

    public int[] intersect(int[] nums1, int[] nums2) {
        int[] first;
        int[] second;
        if (nums1.length < nums2.length) {
            first = nums1;
            second = nums2;
        } else {
            first = nums2;
            second = nums1;
        }

        int[] itemsCount = new int[ITEM_MAX_VALUE - ITEM_MIN_VALUE + 1];
        for (int num : first) {
            itemsCount[num - ITEM_MIN_VALUE]++;
        }

        int[] result = new int[first.length];
        int index = 0;
        for (int num : second) {
            int itemIndex = num - ITEM_MIN_VALUE;
            if (itemsCount[itemIndex] > 0) {
                result[index++] = num;
                itemsCount[itemIndex]--;
            }
        }
        return Arrays.copyOf(result, index);
    }
}
