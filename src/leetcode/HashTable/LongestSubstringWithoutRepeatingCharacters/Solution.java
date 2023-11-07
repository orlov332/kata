package leetcode.HashTable.LongestSubstringWithoutRepeatingCharacters;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> substringChars = new HashMap<>(s.length());
        int maxCount = 0;

        int left = 0;
        int right = 0;
        while (right < s.length()) {
            char letter = s.charAt(right);
            substringChars.compute(letter, (k, v) -> v == null ? 1 : v + 1);

            while (substringChars.get(letter) > 1) {
                char letterToRemove = s.charAt(left);
                substringChars.computeIfPresent(letterToRemove, (k, v) -> v - 1);
                left++;
            }

            maxCount = Math.max(maxCount, right - left + 1);

            right++;
        }
        return maxCount;
    }
}
