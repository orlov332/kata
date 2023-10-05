package leetcode.ArrayAndString.strStr;

class Solution {
    public int strStr(String haystack, String needle) {
        for (int haystackIndex = 0; haystackIndex <= haystack.length() - needle.length(); haystackIndex++) {
            int needleIndex = 0;
            while (haystack.charAt(haystackIndex + needleIndex) == needle.charAt(needleIndex)) {
                needleIndex++;
                if (needleIndex == needle.length()) {
                    return haystackIndex;
                }
            }
        }
        return -1;
    }
}
