package leetcode.HashTable.JewelsAndStones;

class Solution {

    public static final int STONES_TYPE_RANGE = 52;

    public int numJewelsInStones(String jewels, String stones) {
        int[] stonesGroups = new int[STONES_TYPE_RANGE];
        for (char stone : stones.toCharArray()) {
            stonesGroups[stone % STONES_TYPE_RANGE]++;
        }
        int count = 0;
        for (char jewel : jewels.toCharArray()) {
            count += stonesGroups[jewel % STONES_TYPE_RANGE];
        }
        return count;
    }
}
