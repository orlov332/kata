package leetcode.ArrayAndString.LongestCommonPrefix;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder prefix = new StringBuilder();
        String first = strs[0];
        for (int prefixIndex = 0; prefixIndex < first.length(); prefixIndex++) {
            char symbol = first.charAt(prefixIndex);
            for (String str : strs) {
                if (prefixIndex >= str.length() || symbol != str.charAt(prefixIndex)) {
                    return prefix.toString();
                }
            }
            prefix.append(symbol);
        }
        return prefix.toString();
    }
}
